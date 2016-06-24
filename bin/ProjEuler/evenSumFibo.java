/**
 * 
 */
package proj.Euler;

import java.util.Scanner;

/**
 * @author hemin_000
 *
 */
public class evenSumFibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        long[] ar = new long[tc];
        long sum;
        
        while(tc>0){
            long a=1, b=2, t=0, c = 0;
            ar[tc-1] = in.nextLong();
            sum=2;
            while(c<=ar[tc-1]){
                c = a + b;
                t = b;
                b = c;
                a = t;
                if(c%2==0 && c<ar[tc-1])
                    sum += c;
            }
            System.out.println(sum);
            tc--;
        }
        
    }

		
	}


