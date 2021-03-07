package labbook.lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the signal color");
		Scanner scanner = new Scanner(System.in);
		String signal=scanner.next();
		if(signal.equalsIgnoreCase("red")) {
			System.out.println("stop");
		}
		else if(signal.equalsIgnoreCase("yellow")) {
			System.out.println("Ready");
		}
		else {
			System.out.println("Go!");
		}
	}

}
