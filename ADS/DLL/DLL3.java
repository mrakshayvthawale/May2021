package list;



public class DLL3 {
	Node head; // head of list

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) { data = d; }
	}

	public void insert(int new_data)
	{
		
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null)
			head.prev = new_Node;
		head = new_Node;
	}

	public void InsertAfter(Node prev_Node, int new_data)
	{
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_Node.next;
		prev_Node.next = new_node;
		new_node.prev = prev_Node;
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	// Add a node at the end of the list
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		Node last = head; 
		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}

	public void display(Node node)
	{
		Node last = null;
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
		System.out.println();
	}
		
		void deleteNode(Node del)
		{

			// Base case
			if (head == null || del == null) {
				return;
			}

			if (head == del) {
				head = del.next;
			}
			if (del.next != null) {
				del.next.prev = del.prev;
			}
			if (del.prev != null) {
				del.prev.next = del.next;
			}
			return;
		}
	

	public static void main(String[] args)
	{
		DLL3 dll = new DLL3();
		dll.append(11);
		dll.insert(22);
		dll.insert(33);
		dll.append(44);
		dll.InsertAfter(dll.head.next, 88);

		System.out.println("Created DLL is: ");
		dll.display(dll.head);
		
		System.out.println();
		System.out.println("Deletion....(head.next) ");
		dll.deleteNode(dll.head.next);
		dll.display(dll.head);
		
	}
}
