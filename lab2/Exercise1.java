package labbook.lab2;

import java.util.Scanner;

public class Exercise1 {
	public static int getSecondSmallest(int[] array)
	{	int small=array[0],secondsmall=999999999;
		for(int i=1;i<array.length;i++) {
			if(array[i]<=small) {
				secondsmall = small;
				small=array[i];
			}
			else if(array[i]<=secondsmall) {
				secondsmall = array[i];
			}
		}
		return secondsmall;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number,array[];
		System.out.println("Enter the size ");
		number=scanner.nextInt();
		array=new int[number];
		for(int i=0;i<number;i++) {
			array[i]=scanner.nextInt();
		}
		int result = getSecondSmallest(array);
		System.out.println("the second smallest is :"+result);
	}

}
