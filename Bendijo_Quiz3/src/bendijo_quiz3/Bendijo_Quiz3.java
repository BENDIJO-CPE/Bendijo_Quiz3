package bendijo_quiz3;
import java.util.Scanner;

public class Bendijo_Quiz3 {
public static int MAX = 9;
private int [] data;
private int head;
private int tail;

private static int MX = 99999;
private static int [] data2 = new int [MX++];
private int front;
private int rear;

    public Bendijo_Quiz3 (){
        data = new int [MAX];
        head = 0;
        tail = 0;
    }
 private void insertion (int index) throws Exception {
     if (head == MAX -1){
         throw new Exception("Queue is full");   
     }else {
         data[tail++] = index;
     }
     
 }

 
 public void display ()throws Exception{
     if (head == tail){
         throw new Exception("Queues is empty");
     }
     System.out.println("------------------");
     System.out.println("\nYour Queues...");
     
     for (int i = head; i < tail; i++) {
         System.out.println(data[i] + "");
     }
     System.out.println("\n------------------");
 }
 
 ///////////////////////////////////////////////////////////////////////////
 
 
 private void insertion2 (int index) throws Exception {
    
    if ((front == 0 && rear == MX -1) || (rear + 1 == front)){
        throw new Exception ("Queue is full"); 
    }
    
    if (rear == MX -1){
        rear = 0;
    }else if (front == 1){
        front = 0;  
    }else {
        data2[rear++] = index;
    }
}
 public void insertEnding (int index) throws Exception {
        data[++rear] = index;
    }
private int deletion () throws Exception {
    
    if (front == -1){
        throw new Exception("Queue is empty");
    }
    
    int temporary = data2[front];
    
    if (front == rear){
        front = rear = -1;
        
    }else if (front == MX -1){
        front = 0;
    }else {
        front++;
    }
    return temporary;
    
}

    public int DeleteEnding () throws Exception {
        

        int temporary = data [rear];
        
        if (front == rear){
            front = rear = -1; 
        }else {
            rear--;
        }
        return temporary; 
    }
private void display2 () throws Exception {
    //OVERFLOW
    if (front == -1){
        throw new Exception ("Queue is Empty");
    }
    
    if (rear < front){
        for (int i = front; i <= MX -1; i++) {
            System.out.println(data2[i] + " ");
        }
        for (int i = 0; i < rear; i++) {
            System.out.println(data2[i] + " ");
        }
        
    }else {
        for (int i = front; i < rear; i++) {
            System.out.println(data2[i] + "");
        }
    }
    System.out.println("Null");
}
 

    public static void main(String[] args) throws Exception{
       Bendijo_Quiz3 dis = new Bendijo_Quiz3 ();
       Scanner scan = new Scanner (System.in);
       
       boolean start = true;
       
       while (start){
           System.out.println("Number 1, 2 ?");
           int number = scan.nextInt();
           
          
                if (number == 2){
                    boolean n2 = true;
                    
                    while (n2){
                        System.out.println("1. Insert");
                        System.out.println("2. Display");
                        System.out.println("3. Delete");
                        
                        int num2 = scan.nextInt ();
                        int element;
                        
                        switch (num2) {
                            
                            
                            case 1:
                             
                        
                                  
                                    System.out.println("Enter element");
                                    element = scan.nextInt();
                                    System.out.println("Choose Position");
                                    System.out.println("1. Insert by Beginning");
                                    System.out.println("2. Insert by Ending");
                                    int choice = scan.nextInt();
                                    
                                    switch (choice) {
                                        case 1:
                                            dis.insertion2(element);
                                            break;
                                        case 2:
                                            dis.insertEnding(element);
                                            break;
                                        default:
                                            throw new AssertionError("Invalid . . Insert the Beggining first");
                                    }
                                
                            case 2:
                                dis.display2();
                                break;
                            case 3:
                                System.out.println("1. Delete");
                                System.out.println("2. Delete by choosen position");
                                int deleteme = scan.nextInt();
                                
                                if(deleteme == 2){
                                    System.out.println("1. Beginning");
                                    System.out.println("2. Ending");
                                    int deletebychoice = scan.nextInt();
                                    
                                    switch (deletebychoice) {
                                        case 1:
                                            dis.deletion();
                                            System.out.println(" succesfully");
                                            break;
                                        case 2:
                                            dis.DeleteEnding();
                                            System.out.println(" succesfully");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                }else if (deleteme == 1){
                                
                                System.out.println(dis.deletion() + "Deleted successfully");

                        }
                    }
                    }
                }else if (number == 1){
                boolean n1 = true;
                       while (n1){
               System.out.println("1. Insert");
               System.out.println("2. Display");
               int num1 = scan.nextInt();
               
               int index;
               
               switch (num1) {
                   
                   case 1:
                      
                    System.out.println("Enter element");
                    index = scan.nextInt();
                    dis.insertion (index);
                    System.out.println(index + " is inserted");
                    break;
                    case 2:
                       dis.display();
                       
                       break;
                       
                   default:
                       throw new AssertionError();
               }
               }
                                
                    }
               
           }
       }
    }
   
