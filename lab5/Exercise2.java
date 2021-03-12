package labbook.lab5;

import java.util.Scanner;

class NameExceptions extends Exception{
	public NameExceptions(String s) {
		super(s);
	}
}

public class Exercise2 {

	public static void main(String[] args) throws NameExceptions{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first name and last name ");
		String firstname = "";
		String lastname = "";
		if(firstname.isBlank() && lastname.isBlank()) {
			throw new NameExceptions("Not a valid name");
		}
		else {
			System.out.println("valid");
		}
	}

}
