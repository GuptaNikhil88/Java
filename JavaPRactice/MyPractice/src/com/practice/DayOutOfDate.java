	package com.practice;

	import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

	public class DayOutOfDate {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        try{
	        SimpleDateFormat dtft = new SimpleDateFormat ("dd/MM/yyyy");
	        String dateString =  day +"/"+month+"/"+year;
	        Date dt = dtft.parse(dateString);
	        
	        //GIVES String value of Day
	        SimpleDateFormat dtft2 = new SimpleDateFormat ("EEEE");
	        String wd = dtft2.format(dt);
	        System.out.println(wd);
	        
	        //integer value of Day, MONDAY=1 and so on
	        Calendar c = Calendar.getInstance();
	        c.setTime(dt);
	        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	        
	       // int dayi = dt.getDay();
	        System.out.println(dayOfWeek);
	        }
	        catch (ParseException e){
	        	
	        	e.printStackTrace();
	        }
	    }
	}


