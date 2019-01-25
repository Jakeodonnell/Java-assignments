//********************************************************************
//  Seconds.java       Java Foundations
//
//  Solution to Programming Project 2.6
//********************************************************************

import java.util.Scanner;

public class Seconds
{
   //-----------------------------------------------------------------
   //  Computes the total number of seconds for a given number of
   //  hours, minutes, and seconds.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int SECONDS_PER_HOUR = 3600;
      final int SECONDS_PER_MINUTE = 60;

      int seconds, minutes, hours, totalSeconds;

	Scanner scan = new Scanner(System.in);

      System.out.print ("Enter the number of hours: ");
      hours = scan.nextInt();
      System.out.print ("Enter the number of minutes: ");
      minutes = scan.nextInt();
      System.out.print ("Enter the number of seconds: ");
      seconds = scan.nextInt();

      totalSeconds = hours * SECONDS_PER_HOUR +
                     minutes * SECONDS_PER_MINUTE +
                     seconds;

      System.out.println ();
      System.out.println ("Total seconds: " + totalSeconds);
   }
}
