package labbook.lab1;

import java.util.Scanner;

public class Exercise7 {
	public static boolean checkNumber(int n) {
		int digit=0,minimum=10;
		while(n>0) {
			digit=n%10;
			if(minimum>=digit) {
				minimum=digit;
				n=(int)(n/10);
			}
			else {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("enter the number:");
		number=scanner.nextInt();
		if(checkNumber(number)) {
			System.out.println("Number is an Increasing Number");
		}
		else {
			System.out.println("Number is not an Increasing Number");
		}
	}

}
