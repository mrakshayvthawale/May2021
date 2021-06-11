package list;

class BT2
{
	Node root;
	static class Node
	{
		int data;
		Node left, right;
		
		Node(int d)
		{
		data = d;
		left = right = null;
		
		}
	}
	BT2()
	{
		root = null;
	}
	BT2(int d)
	{
		root = new Node(d);
	}
	void Inorder(Node node)
	{
		if(node == null)
			return;
		Inorder(node.left);
		System.out.print(node.data+" ");
		Inorder(node.right);
	}
	
	void Preorder(Node node)
	{
		if(node == null)
			return;
		System.out.print(node.data+ " ");
		Preorder(node.left);
		Preorder(node.right);
		
	}
	
	void Postorder(Node node)
	{
		if(node == null)
			return;
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.data+" ");
	}
	
	
	void Inorder()
	{
		Inorder(root);
	}
	void Preorder()
	{
		Preorder(root);
	}
	void Postorder()
	{
		Postorder(root);
	}
	
	public static void main(String args[])
	{
		BT2 t1 = new BT2();
		t1.root = new Node(1);
		t1.root.left = new Node(2);
		t1.root.right = new Node(3);
		t1.root.left.left = new Node(4);
		t1.root.left.right = new Node(5);
		
		System.out.println("Inorder Traversal : ");
		t1.Inorder();
		System.out.println();
		System.out.println("Preorder Traversal : ");
		t1.Preorder();
		System.out.println();
		System.out.println("Postorder Traversal : ");
		t1.Postorder();
	}
}