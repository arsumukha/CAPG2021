package labbook.lab1;

import java.util.Scanner;

public class Exercise3B {
	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,result=0;
		System.out.println("enter the nth value");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		result=fibonacci(n);
		System.out.println("The "+n+"th fibonacci number is :"+result);
	}

}
