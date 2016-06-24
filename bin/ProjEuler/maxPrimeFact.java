/**
 * 
 */
package proj.Euler;

/**
 * @author hemin_000
 *
 */

import java.util.ArrayList;
import java.util.List;

public class maxPrimeFact {

	/**
	 * @param args
	 */
	
	public static List<Integer> primeFactors(int numbers) {
	    int n = numbers;
	    List<Integer> factors = new ArrayList<Integer>();
	    for (int i = 2; i <= n / i; i++) {
	      while (n % i == 0) {
	        
	        n /= i;
	      }
	      factors.add(i);
	    }
	    if (n > 1) {
	      factors.add(n);
	    }
	    return factors;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primefactors of 44");
	    for (Integer integer : primeFactors(44)) {
	      System.out.println(integer);
	    }
	    System.out.println("Primefactors of 3");
	    for (Integer integer : primeFactors(3)) {
	      System.out.println(integer);
	    }
	    System.out.println("Primefactors of 32");
	    for (Integer integer : primeFactors(32)) {
	      System.out.println(integer);
	    }

	}

}
