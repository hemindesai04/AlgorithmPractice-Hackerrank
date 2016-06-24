package treeExamples;

public class postOrder {

	public void postorder(Node root) {
		// TODO Auto-generated method stub
	
		if(root.left != null)
			postorder(root.left);
		if(root.right != null)
			postorder(root.right);
		System.out.print(root.data + " ");
		
	}

}
