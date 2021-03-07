package labbook.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static String[] sortStrings(String[] strings) {
		Arrays.sort(strings);
		for(int i=0;i<strings.length;i++) {
			if(i<Math.ceil(strings.length)/2) {
				strings[i]=strings[i].toUpperCase();
			}
			else {
				strings[i]=strings[i].toLowerCase();
			}
		}
		return strings;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int numberOfStrings;
		String[] strings;
		System.out.println("Enter the number of strings");
		numberOfStrings=scanner.nextInt();
		System.out.println("Enter the strings");
		strings =new String[numberOfStrings];
		for(int i=0;i<numberOfStrings;i++) {
			strings[i]=scanner.next();
		}
		strings=sortStrings(strings);
		for(int i=0;i<numberOfStrings;i++) {
			System.out.println(strings[i]);
		}
	}

}
