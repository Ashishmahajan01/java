package JavaDSADay15;

public class LinkedList {
    
    
    static class Node{
         int val;
         Node next;
        public Node() {
            super();
        }
        public Node(int val) {
            super();
            this.val = val;
            this.next = null;
        }
        static Node head;
        
        public static void add(int val) {
            Node temp= new Node(val);
            if(head ==null) {
                head=temp;
            }
            else {
                Node trav = head;
                while(trav.next!=null) {
                    trav=trav.next;
                }
                trav.next=temp;
            }
        }
        public static void addfirst(int val) {
            Node temp= new Node(val);
            if(head ==null) {
                head=temp;
            }
            else {
                temp.next=head;
                head = temp;
            }
        }  
        
        public static void insertAtPosi(int val,int posi) {
            Node temp= new Node(val);
            if(head ==null) {
                head=temp;
            }
            else {
               int count =1;
               Node travs= head;
               while(travs != null && count < posi-1) {
                   travs=travs.next;
                   count++;
               }
               Node temp1=travs.next;
               travs.next=temp;
               temp.next=temp1;
               
            }
        }  
        
        
        public static void removeAtPosi(int posi) {
            
            if(head ==null) {
                return;
            }
            else {
               int count =1;
               Node travs= head;
               while(travs != null && count < posi-1) {
                   travs=travs.next;
                   count++;
               }
               if(travs==null) {
                   System.out.println("insert valid  position");
                   return;
               }
               Node remove=travs.next;
               Node temp1=travs.next.next; 
               travs.next=temp1;
               remove.next=null;
               
            }
        }  
        
        
        
        
        public static void display() {
            Node temp=head;
            while(temp != null) {
                System.out.print("->"+ temp.val);
                temp=temp.next;
            }
            System.out.println();
        }  
        public static void main(String[] args) {
            add(15);
            add(12);
            add(10);
            add(11);
            add(16);
            add(12);
           // display();
            addfirst(1);
            addfirst(2);
            //display();
            insertAtPosi(333, 3);
            display();
            removeAtPosi(3);
            display();
        }
        
         
    }

}
