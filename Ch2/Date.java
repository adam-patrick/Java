package Ex2;

public class Date 
{
	
	
	public static void main(String[] args)
	{
		String day = "Sunday";
		String month = "May";
		int date = 29;
		int year = 2022;
		
		// Ch2 E2 # 3
	
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		
		// CH2 E2 # 4
		
		System.out.println(day + ", " + month + " " + date + ", " + year + ".");
		
		// CH2 E2 # 5
		
		System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
		System.out.println("European format: " + day + " " + date + " " + month + " " + year);
	}
}
