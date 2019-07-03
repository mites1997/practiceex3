
//try catch example which goes to try catch and finally block
package com.stackroute.pex3;


public class ExceptionExample {
  public static void main(String args[])
  {
    try {
      System.out.println(" try Block");//try block message
      throw new Exception();//Exception thrown
    }
    catch(Exception e)
    {
      System.out.println(" catch block");//catch block message
    }
    finally {
      System.out.println(" finally block");//finally block message
    }
  }
  }

