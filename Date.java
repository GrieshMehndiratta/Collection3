package CollectionIII;
import java.util.*;

class Date {

	public static HashMap<String, String> month = new HashMap<String, String>();

	public static void date()
	{

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

	}

	public static String Date_Conversion(String Input) 
	{
		String Date = Input.substring(0, 2);
		String Month = Input.substring(3, 5);
		String Year = Input.substring(6, 10);
		return  Date + " " + month.get(Month) + " " + Year ;
	}

	public static void main(String args[]) 
	{
		date();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date in the format: DD/MM/YYYY");
		String a = sc.nextLine();
		System.out.println(Date_Conversion(a));  
		sc.close();


	}
}