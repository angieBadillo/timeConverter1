import java.util.*;
import java.math.*;

public class TimeConverter {
	
	public static final int secondsHour = 3600;
	public static final int secondsMinute = 60;
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the time conversion program!");

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of hours: ");
		int numHours = Integer.parseInt(Scan.nextLine());

		System.out.println("Enter the number of minutes: ");
		int numMinutes = Integer.parseInt(Scan.nextLine());
		

		System.out.println("Enter the number of seconds: ");
		int numSeconds = Integer.parseInt(Scan.nextLine());
		
		int totalSeconds = numHours * secondsHour;
		totalSeconds += (numMinutes * secondsMinute);
		totalSeconds += secondsMinute;

		System.out.println("number of seconds is: " + totalSeconds);
		
		//PART TWO

		System.out.println("Enter the number of seconds: ");
		int numSecondsReverse = Integer.parseInt(Scan.nextLine());

		int totalHours = numSecondsReverse / secondsHour;
		
		int totalMinutes = numSecondsReverse % secondsHour / secondsMinute;
		
		int totalRemainingSeconds = (numSecondsReverse % secondsHour) % secondsMinute;
	
		
		System.out.println("That is " + totalHours + " hours, " +
				totalMinutes + " minutes " + " and " + totalRemainingSeconds + 
						" seconds.");
		}
		

	}


