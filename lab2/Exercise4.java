package labbook.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	public static int top=0;
	public static int[] modifyArray(int array[]) {
		int i=array.length - 1;
		top=array.length;
		Arrays.sort(array);
		while(i>=0) {
			if(i-1>=0) {
				if(array[i-1]==array[i]) {
					for(int j=i-1;j+1<array.length;j++) {
						array[j]=array[j+1];
					}
					top--;
				}
			}
			i--;
		}
		return array;
	}
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int number,array[];
		System.out.println("enter the number of elements");
		number = scanner.nextInt();
		array = new int[number];
		System.out.println("enter the elements of array");
		for(int i=0;i<number;i++) {
			array[i]=scanner.nextInt();
		}
		array=modifyArray(array);
		System.out.println("elements of array are");
		for(int i=0;i<top;i++) {
			System.out.println(array[i]);
		}
	}
}
