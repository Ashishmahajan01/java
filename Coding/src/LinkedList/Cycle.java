package LinkedList;

public class Cycle {
	public boolean hasCycle(ListNode head) {
        ListNode fastptr = head;
		ListNode slowptr = head;
		while(fastptr !=null  && fastptr.next !=null) {
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			if(slowptr == fastptr) {
				return true;
				
			}
		}
        return false;
        
        
    }
	
	public static void main(String[] args) {
		
	}

}
