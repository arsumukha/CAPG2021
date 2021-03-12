package labbook.lab5;

import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String s) {
		super(s);
	}
}
public class Exercise1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age<15) {
			throw new AgeException("YOU CANT VOTE ");
		}
		else {
			System.out.println("please vote");
		}
	}

}
