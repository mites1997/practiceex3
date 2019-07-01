/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/
package com.stackroute.pex3;
import java.util.*;

public class StudentMarks {
  int studentno;
  Scanner scanner=new Scanner(System.in);
  public void setNumberOfStudents(int n)
  {
    this.studentno=n; //no of students set
  }
  private  int[] stuGrades=new int[studentno];//grades of students
  public void setGrades()
  {   int check=0;
    for(int i=0;i<=studentno;i++)
    {System.out.println("Grade of "+i+"Student");//grades inputted
      check=scanner.nextInt();
      while(checkInvalidity(check))//grades checked if it is within the specified range
      {
        System.out.println("Invalid input");
        check=scanner.nextInt();
      }
      stuGrades[i]=check;
    }
  }
  boolean checkInvalidity(int n)//method to check if the input is invalid
  {
    if(n<100&&n>0)
      return false;

    else
      return true;
  }
}
