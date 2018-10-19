
public class Implementation {
    
static DoubleEndedQueue QM = new DoubleEndedQueue();
    
    /*
     * enqueFront();
     * enqueBack();
     * dequeFront();
     * dequeBack();
     * peekFront();
     * peekBack();
     */

    public static void main(String[] args){
        QM.enqueBack(1);
        QM.peekFront();        
        QM.enqueBack(2);
        QM.peekBack();  
        QM.enqueBack(3);
        QM.peekBack();
        QM.dequeBack();
        QM.peekBack();        
        QM.dequeFront();
        QM.peekFront();        
        QM.enqueFront(5);
        QM.enqueBack(9);
        QM.peekFront();
        QM.peekBack();
        
    }
}
