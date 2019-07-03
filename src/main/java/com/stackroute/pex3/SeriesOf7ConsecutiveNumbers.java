//find if the series of nos is consecutive
package com.stackroute.pex3;

public class SeriesOf7ConsecutiveNumbers {
  public static String checkSeriesOf7(String inputstring)
  {
    String[] numbers=inputstring.split(" ");//splits the string by spaces
    for(int i=1;i<numbers.length;i++)
    {
      if(Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1])!=1)//difference between numbers is not one hence not consecutive
      {
        return "is not consecutive";
      }

    }
    return  "is consecutive";//consecutive
  }
}
