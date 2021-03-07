package labbook.lab1;

import java.util.Scanner;
	
public class Exercise8 {
	public static boolean checkNumber(int n) {
		double nx;
		nx=Math.log10(n)/Math.log10(2);
		if(nx-(int)nx==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("enter the number");
		number = scanner.nextInt();
		System.out.println(checkNumber(number));
	}

}
