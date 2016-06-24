
package proj.Euler;

import java.util.Scanner;

/**
 * @author hemin_000
 *
 */
public class MultipleSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        long sum=0;
        int tc = in.nextInt();
        long[] ar = new long[tc];
        for(int i=0;i<tc;i++){
            sum=0;
            ar[i] = in.nextLong();
            sum = ((ar[i]-1)/3*(6 + ((ar[i]-1)/3 -1)*3))/2 + ((ar[i]-1)/5*(10 + ((ar[i]-1)/5 - 1)*5))/2 - ((ar[i]-1)/15 *(30 + ((ar[i]-1)/15 - 1)*15))/2;
            /*for(long j=0;j<ar[i];j++){
                if(j%3==0 || j%5==0)
                    sum+=j;
            }*/
            System.out.println(sum);
        }	

	}

}
