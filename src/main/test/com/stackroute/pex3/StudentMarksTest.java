package com.stackroute.pex3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
StudentMarks s;
  @Before
  public void setUp() throws Exception {
    s=new StudentMarks();
  }

  @After
  public void tearDown() throws Exception {
    s=null;
  }
  @org.junit.Test
  public void checkInvalidityShouldReturnTrue(){
    StudentMarks sm=new StudentMarks();
    assertEquals(true,sm.checkInvalidity(0));
  }

  @org.junit.Test
  public void checkInvalidityShouldReturnTrue1(){
    StudentMarks sm=new StudentMarks();
    assertEquals(true,sm.checkInvalidity(100));
  }
  @org.junit.Test
  public void checkInvalidityShouldReturnFalse(){
    StudentMarks sm=new StudentMarks();
    assertEquals(false,sm.checkInvalidity(66));
  }

}
