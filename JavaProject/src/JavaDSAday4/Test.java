package JavaDSAday4;

public class Test {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtBg(23); //call to insert function will create 1st node in memory
        l1.insertAtBg(56);
        l1.insertAtBg(6);
        l1.insertAtBg(8);
        l1.insertAtBg(16);
        l1.insertAtBg(88);
    
        l1.display();
        
        l1.deleteAtLast();
        l1.display();
        
        //l1.search(56);
        
        l1.deleteAtBeg();
        l1.display();
        
        //l1.insertAtPosi(69,3);
        //l1.display();
        
        l1.deleteAtposi(1);
        l1.display();

    }

}
