package labbook.lab1;

import java.util.Scanner;

public class Exercise6 {
	public static int calculateDifference(int n) {
		int squareofsum=0,sumofsquare=0;
		sumofsquare = (n*(n+1)*(2*n+1))/6;
		squareofsum= (int)Math.pow((n*(n+1))/2, 2);
		return sumofsquare - squareofsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,result;
		System.out.println("enter the number");
		Scanner scanner =new Scanner(System.in);
		number = scanner.nextInt();
		result = calculateDifference(number);
		System.out.println("The difference is:"+result);
	}

}
