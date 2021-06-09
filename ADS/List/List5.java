//Insert and Delete operation in Linked List.
// Deletion from position identification.

class List5
{
Node head;//Start of list

static class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
	
}
 public void display()
 {
	 Node n = head;
	 while(n != null)
	 {
		 System.out.print(n.data+ "--->");
		 n = n.next;
		 
	 }
		 
 }
 
 //Insert at begining
  public void insert(int new_data)
  {
	Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	
  }
  
  public void insertAfter(Node prev_node, int new_data)
  {if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	  
  }
  
  public void append(int new_data)
  {
	  Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		return;
	  
		  
  }
  void deleteNode(int position) {
		if (head == null)
			return;
		Node temp = head;
		if (position == 0) {
			head = temp.next; // Change head
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;
		if (temp == null || temp.next == null)
			return;
		Node next = temp.next.next;
		temp.next = next;
	}
	 

public static void main(String args[])
{
	List5 l1 = new List5();
	
	l1.head = new Node(11);
	Node second  = new Node(22);
	Node third = new Node(33);
	
	l1.head.next = second;
	second.next = third;
	
	l1.display();// 11 22 33
	System.out.println("...........");
	l1.insert(44);// 44 11 22 33
	l1.insertAfter(l1.head.next, 55);//44 11 55 22 33
	l1.append(88);//44 11 55 22 33 88
	
	l1.append(86);
	System.out.println("...........");
	l1.display();
	l1.append(83);
	System.out.println("...........");
	System.out.println();
	l1.display();
	
	l1.insertAfter(l1.head.next, 65);
	System.out.println();
	l1.display();
	
	l1.deleteNode(1);
	System.out.println();
	l1.display();
	
	
	
	
}

}