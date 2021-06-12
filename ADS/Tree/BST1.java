
class BST1 {
	Node root;
	class Node {
		int data;
		Node left, right;

		public Node(int d)
		{
			data = d;
			left = right = null;
		}
	}

	BST1() 
	{ 
		root = null; 
	}

	// Deletion-------
	void delete(int key) 
	{ 
		root = deleteData(root, key);
	}

	
	Node deleteData(Node root, int key)
	{
		//Empty tree
		if (root == null)
			return root;

		
		if (key < root.data)
			root.left = deleteData(root.left, key);
		else if (key > root.data)
			root.right = deleteData(root.right, key);


		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder
			// successor (smallest in the right subtree)
			root.data = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteData(root.right, root.data);
		}

		return root;
	}

	int minValue(Node root)
	{
		int minv = root.data;
		while (root.left != null)
		{
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}


	void insert(int key) { root = insertData(root, key); }


	Node insertData(Node root, int key)
	{

	//Empty key
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.data)
			root.left = insertData(root.left, key);
		else if (key > root.data)
			root.right = insertData(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

//Tree traverse
	void Inorder() { Inorder(root); }

	// A utility function to do inorder traversal of BST
	void Inorder(Node root)
	{
		if (root != null) {
			Inorder(root.left);
			System.out.print(root.data + " ");
			Inorder(root.right);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		BST1 t1 = new BST1();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
		20 40 60 80 */
		t1.insert(55);
		t1.insert(33);
		t1.insert(22);
		t1.insert(44);
		t1.insert(77);
		t1.insert(66);
		t1.insert(88);

		System.out.println(
			"Inorder traversal of the given tree");
		t1.Inorder();

		System.out.println("\nDelete 22.......");
		t1.delete(22);
		System.out.println(
			"Inorder traversal of the modified tree");
		t1.Inorder();

		System.out.println("\nDelete 33");
		t1.delete(33);
		System.out.println(
			"Inorder traversal of the modified tree");
		t1.Inorder();

		System.out.println("\nDelete 55");
		t1.delete(55);
		System.out.println(
			"Inorder traversal of the modified tree");
		t1.Inorder();
	}
}

