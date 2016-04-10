import java.util.Calendar;
import java.util.Scanner;

public class Session2Assignment4{
	public static void main (String[] args){
		
		int year;
		year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println (year);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Complete Month Name :");
		String month = scanner.next();
		switch(month.toLowerCase())
		{
		case "january":
			System.out.println ("No of Days in Month are 31");
			break;
		case "febuary" :
			if (year%4==0){ 
			System.out.println ("No of Days in Month are 29"); }
			else {System.out.println ("No of Days in Month are 29");}
			break;
		case "march" :
			System.out.println ("No of Days in Month are 31");
			break;
		case "april" :
			System.out.println ("No of Days in Month are 30");
			break;
		case "may" :
			System.out.println ("No of Days in Month are 31");
			break;
		case "june" :
			System.out.println ("No of Days in Month are 30");
			break;
		case "july" :
			System.out.println ("No of Days in Month are 31");
			break;
		case "august" :
			System.out.println ("No of Days in Month are 31");
			break;
		case "september" :
			System.out.println ("No of Days in Month are 30");
			break;
		case "october" :
			System.out.println ("No of Days in Month are 31");
			break;
		case "november" :
			System.out.println ("No of Days in Month are 30");
			break;
		case "december" :
			System.out.println ("No of Days in Month are 31");
			break;
		default:
				System.out.println ("Invalid Month Name");
			break;
		}
		
		
		scanner.close();
	}
}