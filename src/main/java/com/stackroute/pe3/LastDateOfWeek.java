//Write a java program to calculate first and last date of a week.
package com.stackroute.pe3;
import java.util.*;
import java.time.*;
import java.text.*;

public class LastDateOfWeek {


    public static void main(String []args){
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println("First Date of Week:");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println("Last Date of Week:");
        System.out.println(df.format(c.getTime()));
        System.out.println();
    }
}
