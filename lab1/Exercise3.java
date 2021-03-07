package labbook.lab1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fib[];
		System.out.println("Enter the nth value");
		Scanner scanner = new Scanner(System.in);
		System.out.println("<====================================>");
		n=scanner.nextInt();
		fib = new int[n];
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println("the n th fibonaci number is:"+fib[n-1]);
		System.out.println("<====================================>");
	}

}
