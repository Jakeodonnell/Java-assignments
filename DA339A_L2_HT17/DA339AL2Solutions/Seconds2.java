//********************************************************************
//  Seconds2.java       Java Foundations
//
//  Solution to Programming Project 2.7
//********************************************************************

import java.util.Scanner;

public class Seconds2
{
   //-----------------------------------------------------------------
   //  Computes the number of hours, minutes, and seconds that are
   //  equivalent to the number of seconds entered by the user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int SECONDS_PER_HOUR = 3600;
      final int SECONDS_PER_MINUTE = 60;

      int seconds, minutes, hours;
	  
	Scanner scan = new Scanner(System.in);

      System.out.print ("Enter the number of seconds: ");
      seconds = scan.nextInt();

      hours = seconds / SECONDS_PER_HOUR;

      seconds = seconds % SECONDS_PER_HOUR;  // remaining seconds

      minutes = seconds / SECONDS_PER_MINUTE;

      seconds = seconds % SECONDS_PER_MINUTE;  // remaining seconds

      System.out.println ();
      System.out.println ("Hours: " + hours);
      System.out.println ("Minutes: " + minutes);
      System.out.println ("Seconds: " + seconds);
   }
}
