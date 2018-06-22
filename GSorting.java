package CollectionIII;

import java.util.Scanner;


import java.util.Arrays;

public class GSorting {

	public <X> void sort_array (X arr[]) {
		Arrays.sort(arr);
		for(int i =0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		int choice;	
		System.out.println("Genric Sorting");
		System.out.println("1. Integer");
		System.out.println("2. String");
		System.out.println("Enter Your Choice");
		
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		
		System.out.println("Enter number of elements in an array");
		int n = sc.nextInt();

		GSorting s = new GSorting();

		switch(choice)
		{
			case 1:
				Integer [] a = new Integer[n];
				System.out.println("Enter elements in integer array");
				for(int i =0 ; i < n ; i++) {
					a[i] = sc.nextInt();
				}
				s.sort_array(a);
				
				break;
			case 2:
				System.out.println("Enter number of elements in the Strings array");
				int n1 = sc.nextInt();
				String b[] = new String[n1];
				System.out.println("Enter elements in String  array");
				for(int i = 0 ; i < n1 ; i++) {
					b[i] = sc.nextLine();
				}
				
				s.sort_array(b);
				sc.close();
				break;
			
			default:
					System.out.println("Wrong Choice");
					
		}
	}
}