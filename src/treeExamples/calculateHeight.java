package treeExamples;

public class calculateHeight {
	
	int h = 0, maxH = 0;
	public int height(Node root){
		
		
		if(root.left != null){
			h++;
			if(maxH < h)
				maxH = h;
			height(root.left);
			h--;
		}
		if(root.right != null){
			h++;
			if(maxH < h)
				maxH = h;
			height(root.right);
			h--;
		}
		
		return maxH;
	}
}
