package labbook.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise4b {
	public static int[] modifyArray(int array[]) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			if(!list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		int xarray[] = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			xarray[i]=list.get(i);
		}
		Arrays.sort(xarray);
		return xarray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number,array[];
		System.out.println("enter the number of elements");
		number=scanner.nextInt();
		array=new int[number];
		System.out.println("enter the elements of array");
		for(int i=0;i<array.length;i++) {
			array[i] = scanner.nextInt();
		}
		array=modifyArray(array);
		System.out.println(" elements of array are");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
