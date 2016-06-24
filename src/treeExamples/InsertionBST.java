package treeExamples;

public class InsertionBST {

	
	public Node insert(Node root, int value){
		
		// if the root is null
		if(root == null){
			root = new Node(value, null, null);
			return root;
		}
		// if the root is not null
		else{
			if(value < root.data)
				root.left = insert(root.left,value);
			else
				root.right = insert(root.right, value);
		}
		return root;
	}
	
	

}
