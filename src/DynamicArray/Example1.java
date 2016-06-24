package DynamicArray;

import java.util.*;

public class Example1 {
	
	private static int getSequence(long x,int n,long lastAns) throws Exception{
		return (int) ((x^lastAns)%n);
	}
	
	private static int getIndex(long y, long size) throws Exception{
		return (int) ((int)y%size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Refer the text file for input and output format.
		long lastAns = 0;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		
		@SuppressWarnings("unchecked")
		ArrayList<Long>[] ar = new ArrayList[n];
		long x, y;
		int qt;
		
		for(int i=0; i<q; i++){
			
			qt = in.nextInt();
			x = in.nextLong();
			y = in.nextLong();
			
			if(qt==1){
				// query of 1 type. Add element to the required sequence.
				
				int seqNo = 0;
				try {
					seqNo = getSequence(x, n, lastAns);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ArrayList<Long> seq = null;
				if(ar.length != 0 && ar.length > seqNo){
					seq = ar[seqNo];
				}
				if(ar.length != 0 && seq != null){
					seq.add(y);
				}else{
					seq = new ArrayList<Long>();
					seq.add(y);
					ar[seqNo] = seq;
				}
			}
			else{
				//query of type 2. Fetch the element from seq and assign to lastAns.
				
				int seqNo = 0;
				try {
					seqNo = getSequence(x, n, lastAns);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ArrayList<Long> seq = ar[seqNo];
				int indexNo = 0;
				try {
					indexNo = getIndex(y,seq.size());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lastAns = seq.get(indexNo);
				System.out.println(lastAns);
			}
		}		
	}
}
