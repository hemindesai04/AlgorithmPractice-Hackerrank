package Array;

import java.util.*;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> str = new ArrayList<String>();
		for(int n=0; n<N; n++){
			str.add(n, in.next());
		}
		int Q = in.nextInt();
		for(int q=0; q<Q; q++){
			String qstr = in.next();
			for(int n=0; n<N; n++){
				if(str.get(n).equals(qstr)){
					counter++;
				}
			}
			System.out.println(counter);
			counter = 0;
		}
	}

}
