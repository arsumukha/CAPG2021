package labbook.lab1;

import java.util.Scanner;

public class Exercise5 {
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 ||i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,result=0;
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		number = scanner.nextInt();
		result = calculateSum(number);
		System.out.println("The sum is:"+result);
	}

}
