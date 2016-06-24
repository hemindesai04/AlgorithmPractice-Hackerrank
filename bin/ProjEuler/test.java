package proj.Euler;

import java.util.*;

public class test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        while(t>0){
            
            System.out.println(primeFact(s.nextLong()));
            t--;
        }
        
    }
    static long primeFact(long n) {
    	int max=0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n /= i;
            }
            if(i > max){
                max=i;
            }
        }
        return max;
    }
	
}