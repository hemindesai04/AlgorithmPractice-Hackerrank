package treeExamples;

public class PreOrder {

	public void preorder(Node n) {
		// TODO Auto-generated method stub
	
		System.out.print(n.data + " ");
		
		if(n.left != null)
			preorder(n.left);
		if(n.right != null)
			preorder(n.right);
	}
	
	

}
