package treeExamples;

import java.util.Scanner;

public class TreeDemo {
	
	public static void main(String[] args){
		
		// initializing the tree nodes
		Node n = new Node(3,null, null);
		Node n1 = new Node(5,null, null);
		Node n2 = new Node(2,null, null);
		Node n3 = new Node(1,null, null);
		Node n4 = new Node(4,null, null);
		Node n5 = new Node(6,null, null);
		Node n6 = new Node(8, null, null);
		
		
		// referencing the tree nodes
		n.left = n2;
		n.right = n1;
		n1.left = n4;
		n1.right = n5;
		n5.right = n6;
		n2.left = n3;
		
		
		PreOrder pre = new PreOrder();  			// preOrder class object
		System.out.print("Pre-order: ");
		pre.preorder(n); 							// display elements traversed in pre-order 
		System.out.println();
		postOrder post = new postOrder(); 			// postOrder class object
		System.out.print("Post-order: ");
		post.postorder(n);							// display elements traversed in post-order
		System.out.println();
		inOrder in = new inOrder();					// inOrder class object
		System.out.print("In-order: ");
		in.inorder(n);								// display elements traversed in in order
		System.out.println();
		calculateHeight h = new calculateHeight();	
		System.out.println("Height of the tree is:" + h.height(n) ); // print height of the tree
		System.out.println();
		TopView tv = new TopView();
		System.out.print("Top View of the tree is: ");   // print top view of the tree
		tv.top_view(n);
		System.out.println();
		LevelOrder lo = new LevelOrder();
		System.out.print("Level-order: ");
		lo.level_order(n);							// display elements traversed in level order
		System.out.println();
		System.out.println("Enter the element to be inserted in the BST: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();			// input the element to be added in bst
		InsertionBST bst = new InsertionBST();	// create an object of InsertionBST class
		PreOrder prebst = new PreOrder();
		Node nbst = bst.insert(n, value);		// store the root of the new bst
		prebst.preorder(nbst);					// display the new bst in pre-order.
	}

}
