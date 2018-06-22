package CollectionIII;

import java.util.*;

class List_Sort
{
	public static void main(String args[])
	{

		ArrayList arr=new ArrayList();
		arr.add(new Emp(2000,"Griesh",20));
		arr.add(new Emp(1080,"Aman",22));
		arr.add(new Emp(1000,"Spine",23));
		arr.add(new Emp(1400,"Dravy",21));
		
		System.out.println("Sort by Emp_Name");
		Collections.sort(arr,new Emp_Name());
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			Emp E=(Emp)itr.next();
			System.out.println(E.Salary+" "+E.name+" "+E.age);
		}
		
		System.out.println("Sorting by Emp_Age");
		Collections.sort(arr,new Emp_Age());
		Iterator itr1=arr.iterator();
		while(itr1.hasNext())
		{
			Emp E=(Emp)itr1.next();
			System.out.println(E.Salary+" "+E.name+" "+E.age);
		}
		

	}
}
class Emp
{
	int Salary;
	int age;
	String name;

	Emp(int Salary , String name, int age)
	{
		this.Salary = Salary;
		this.name = name;
		this.age = age;
	}
}

class Emp_Name implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Emp E1=(Emp)o1;
		Emp E2=(Emp)o2;

		return E1.name.compareTo(E2.name);
	}
}
class Emp_Age implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Emp E1=(Emp)o1;
		Emp E2=(Emp)o2;

		if(E1.age==E2.age)
			return 0;
		else if(E1.age>E2.age)
			return 1;
		else
			return -1;
	}
}