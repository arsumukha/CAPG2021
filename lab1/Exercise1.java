package labbook.lab1;

import java.util.Scanner;

public class Exercise1 {
	public static double sum(double n) {
		
		return Math.pow((n*(n+1))/2, 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double n,res;
		System.out.println("enter the number");
		n=scanner.nextDouble();
		System.out.println("===========================================");
		res=sum(n);
		System.out.println("result is :"+res);
	}

}
