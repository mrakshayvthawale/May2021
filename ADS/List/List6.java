//Delete Complete Linked List.


class List6
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
  void deleteList() {
		head = null;
	}
  
  
	 

public static void main(String args[])
{
	List6 l1 = new List6();
	
	l1.head = new Node(11);
	Node second  = new Node(22);
	Node third = new Node(33);
	
	l1.head.next = second;
	second.next = third;
	
	l1.display();// 11 22 33
	System.out.println("...........");
	l1.insert(44);
	l1.insert(55);
	l1.insert(88);
	
	System.out.println();
	l1.display();
	
	l1.deleteList();
	System.out.println();
	System.out.println("Linked List is deleted.");
	
	
	
	
	
}

}