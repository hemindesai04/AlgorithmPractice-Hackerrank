package treeExamples;

public class inOrder {
	
	public void inorder(Node root) {
		// TODO Auto-generated method stub
	
		if(root.left != null)
			inorder(root.left);
		System.out.print(root.data + " ");
		if(root.right != null)
			inorder(root.right);
		
		
	}

}
