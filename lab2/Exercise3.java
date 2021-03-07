package labbook.lab2;

import java.util.Arrays;
import java.util.Scanner;
public class Exercise3 {
	public static int[] getSorted(int array[]) {
		StringBuilder string = new StringBuilder();
		for(int i=0;i<array.length;i++) {
			string.append(array[i]);
		}
		string.reverse();
		System.out.println(string);
		Arrays.sort(array);
		return array;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int number,array[];
		System.out.println("enter the number of elements");
		number=scanner.nextInt();
		System.out.println("enter the elements of array");
		array = new int[number];
		for(int i=0;i<number;i++) {
			array[i] = scanner.nextInt();
		}
		array=getSorted(array);
		for(int i=0;i<number;i++) {
			System.out.print(array[i]+",");
		}
	}
}
