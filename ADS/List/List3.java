class List3
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

public static void main(String args[])
{
	List3 l1 = new List3();
	
	l1.head = new Node(11);
	Node second  = new Node(22);
	Node third = new Node(33);
	
	l1.head.next = second;
	second.next = third;
	
	l1.display();
		System.out.println();
	l1.append(44);
	l1.insert(55);
	l1.insertAfter(l1.head.next,88);
	System.out.println();
	l1.display();
}

}