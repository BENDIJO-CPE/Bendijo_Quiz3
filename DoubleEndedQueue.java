
public class DoubleEndedQueue {

    int size = 10;
    int[] queue = new int[size];
    int head = -1;
    int tail = -1;
    
    public boolean isEmpty(){
        if(( head == -1)||( tail == -1)){
            return true;
        } else {
            return false;
        }
    
    }
    
    public void enqueFront(int value){
         
        if(isEmpty() == true){
            
             head =  head+1;
             tail =  tail+1;
             queue[ head] = value;
            
        } else if(( tail+1)% size ==  head) {
            
            throw new IllegalStateException("Queue is full");
            
        } else if((head == 0)|| (head == 1)) {
            if(head == 0) {
                return;
            } else {
                head--;
            }
        } else {
             int i = tail;
             int temp;
             while (i>=head){
                 temp = queue[i];
                 queue[i+1] = temp;
                 i--;
             }
             tail++;
        }
        
         queue[head] = value;
        
    }
    
    public void enqueBack(int value){
        
        if(isEmpty() == true){
            
             head =  head+1;
             tail =  tail+1;
             queue[ head] = value;
            
        } else if(( tail+1) == size) {
            
            throw new IllegalStateException("Queue is full");
            
        } else {
            
             tail++;
        }
        
         queue[tail] = value;
        
    }
    
    public int dequeFront(){
        
        if(isEmpty() == true){

            throw new IllegalStateException("Queue is empty, cant dequeue"); 
            
        } else if ( head ==  tail) {
            
             head = -1;
             tail = -1;
            
        } else {
             
             queue[head] = 0;
             head++;
        }
        return  queue[tail];
    }
    
    
    public int dequeBack(){
        
        if(isEmpty() == true){

            throw new IllegalStateException("Queue is empty, cant dequeue"); 
            
        } else if ( head ==  tail) {
            
             head = -1;
             tail = -1;
            
        } else {
             
             queue[tail] = 0;
             tail--;
        }
        return  queue[tail];
    }
    
    public void peekBack(){
        if(isEmpty() == true){
            System.out.println("Queue is empty");
        }else{
            System.out.println(queue[tail]);
        }
    }
    
    public void peekFront(){
        if(isEmpty() == true){
            System.out.println("Queue is empty");
        }else{
            System.out.println(queue[head]);
        }
    }
}
