package List;

// A simple Java program for traversal of a linked list

class ll{

	Node head; // head of list

	static class Node {

		int data;
		Node next;

		Node(int d) {      // Constructor
			this.data = d;
			next = null;
		} 
	}

	/*
	 * This function prints contents of linked list starting from head
	 */
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	// Driver's code
	public static void main(String[] args) {
		/* Start with the empty list. */
		ll llist = new ll();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second; // Link first node with
									// the second node
		second.next = third; // Link second node with the third node

		// Function call
		llist.printList();
	}
}
