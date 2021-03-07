package labbook.lab1;

import java.util.Scanner;

public class Exercise4 {
	public static int prime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		number = scanner.nextInt();
		System.out.println("the prime numbers are");
		for(int i=2;i<=number;i++) {
			if(prime(i)==1) {
				System.out.println(" "+i+" ");
			}
		}
	}

}
