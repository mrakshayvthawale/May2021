package list;
class List1
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
		
		public static void main(String args[])
		{
			List1 l1 = new List1();
			
			l1.head = new Node(11);
			Node second = new Node(22);
			Node third = new Node(33);
			
			l1.head.next = second;
			second.next = third;
		}
		
		
	
}