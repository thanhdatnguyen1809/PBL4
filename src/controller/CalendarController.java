package controller;

public class CalendarController {
	
	public static void printCalendar(int year)
	{
	    System.out.println("         Calendar - "+year+"\n\n");
	    int days;
	 
	    // get Day_OF_WEEK of 01/01
	    int current = DateController.DayOfWeekByZeller(1, 1, year);
	 
	    for (int i = 1; i <= 12; i++)
	    {
	        days = DateController.numberDaysOfMonth(i, year);
	 
	        // Print the current month name
	        System.out.println("\n  ------------"+MonthController.getNameOfMonth(i)+"-------------\n");
	 
	        // Print the columns
	        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat\n");
	 
	        // Print calendar
	        int k = 0;
	        for (k = 0; k < current; k++)
	        	System.out.printf("     ");
	 
	        for (int j = 1; j <= days; j++)
	        {
	        	System.out.printf("%5d", j);
	 
	            if (++k > 6)
	            {
	                k = 0;
	                System.out.printf("\n");
	            }
	        }
	 
//	        if (k)
//	        	System.out.printf("\n");
	 
	        current = k;
	        
	        if(i%4 == 0) {
	        	System.out.printf("\n\n\n\n\n\n\n\n\n\n\n");
	        }else {
	        	System.out.println("\t\t");
	        }
	    }
	 
	    return;
	}
}
