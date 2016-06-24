package treeExamples;

public class TopView {

	boolean flag = true;							// flag to detect left or right side of the root (true = left)
	int count = 0;									// counter to detect the root
	public void top_view(Node root) {
		// TODO Auto-generated method stub
		if(flag){									
			if(root.left != null){
				count++;
				top_view(root.left);
				count--;
				System.out.print(root.data + " ");
				if(count == 0 && root.right != null){	// once the root is reached traverse right side
					flag = false;						// by making the flag false.
					top_view(root.right);
				}	
			}
			else{
				System.out.print(root.data + " ");
			}
			
		}
		else{
			System.out.print(root.data + " ");
			if(root.right != null)
				top_view(root.right);
		}
	}
}
