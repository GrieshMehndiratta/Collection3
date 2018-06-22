package CollectionIII;

import java.util.*;

class GPrint
{
  public <E> void printArray(E[] inputArray , int n)
  {
	ArrayList<E> Arr=new ArrayList<E>();
	
    for (int i = 0 ; i < n ; i++)
	{
		Arr.add(inputArray[i]);
	}
	System.out.println(Arr);
  }

  public static void main(String args[]) 
  {
	int Choice;
	System.out.println("Enter an option");
	System.out.println("1. Integer");
	System.out.println("2. String");
	System.out.println("3. Double");
	System.out.println("Enter Your Choice");
	
	Scanner sc = new Scanner(System.in);
	Choice = sc.nextInt();
	
	GPrint G=new GPrint();
	
	switch(Choice)
	{
	case 1:
		Integer[] IntegerArray = {10,12,33,24,15,24,16,77,19,34};
		int ia=IntegerArray.length;
		System.out.println("Array IntegerArray contains:");
		G.printArray(IntegerArray,ia);
		break;
		
	case 2: 
		String[] StringArray = {"Griesh","Harsh","Aman","Brave","Dravy","Spine"};
		int sa=StringArray.length;
		System.out.println("\nArray StringArray contains:");
		G.printArray(StringArray,sa);
		
		break;
	case 3:
		Double[] DoubleArray = {2.1,32.17,18.30,19.26,27.34,22.6,4.5,24.6};
		int da=DoubleArray.length;
		System.out.println("\nArray DoubleArray contains:");
		G.printArray(DoubleArray,da);
		
		break;
	default:
			System.out.println("Wrong Choce");
	}
	
  }
}