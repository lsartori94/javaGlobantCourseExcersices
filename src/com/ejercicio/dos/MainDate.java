package com.ejercicio.dos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainDate {

	public static void main(String[] args) {

		// Date format
		DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println("Current Date: "+dateformat.format(date));
		Calendar cal = Calendar.getInstance();
		
		// Time Format
		DateFormat timeformat = new SimpleDateFormat("hh:mm");
		System.out.println("Current Time: "+timeformat.format(date));	
		
		// User prompt for date modification
		System.out.println("Do you want to add days to the date? y/n");
		Scanner promptIn = new Scanner(System.in);
		String c = promptIn.nextLine();
		c = c.toUpperCase();

		// Checks for user modification
		if(c.equals("Y")) {
			System.out.println("Please enter numbers of days to add");
			Scanner dateIn = new Scanner(System.in);
			int daysToAdd = dateIn.nextInt();
			System.out.println(" ");
			int day= cal.get(Calendar.DAY_OF_MONTH);
			int month = cal.get(Calendar.MONTH);
			int year = cal.get(Calendar.YEAR);
			while (daysToAdd > 0) {
				day++;
				daysToAdd--;
				switch (day) {
				case 29:
					// Check if month is February
					if (month == Calendar.FEBRUARY) {
						// Check for 29th of February
						if ((year % 4) != 0) {
							// Doesn't have a 29th
							month = Calendar.MARCH;
							day = 1;
						}
					}
					break;
				case 31:
					switch (month) {
					// Months without 31st
					case Calendar.APRIL:
						month = Calendar.MAY;
						day = 1;
						break;
					case Calendar.JUNE:
						month = Calendar.JULY;
						day = 1;
						break;
					case Calendar.SEPTEMBER:
						month = Calendar.OCTOBER;
						day = 1;
						break;
					case Calendar.NOVEMBER:
						month = Calendar.DECEMBER;
						day = 1;
						break;
					// Months with 31st
					default:
						// Nothing
						break;
					}
					break;
				case 32:
					if (month == Calendar.DECEMBER) {
						month = Calendar.JANUARY;
						year++;
					}
					else {
						month++;
						day = 1;
					}
					break;
				default:
					// Nothing
					break;
				}
				
				cal.set(Calendar.YEAR, year);
				cal.set(Calendar.MONTH, month);
				cal.set(Calendar.DAY_OF_MONTH, day);
				dateIn.close();
			}
		
		promptIn.close();
		// Print
		System.out.println("New Date: "+cal.get(Calendar.YEAR)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DAY_OF_MONTH));
		}
		
	}
}