package com.stackroute.pex3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesOf7ConsecutiveNumbersTest {
  SeriesOf7ConsecutiveNumbers s;
  @Before
  public void setUp() throws Exception {
    s=new SeriesOf7ConsecutiveNumbers();
  }

  @After
  public void tearDown() throws Exception {
    s=null;
  }

  @Test
  public void Seriesof7ShouldReturnIsConsecutive()
  {
    String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("1 2 3 4 5 6 7");
    assertEquals("is consecutive",result);
  }
  @Test
  public void Seriesof7ShouldReturnIsNotConsecutive()
  {
    String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("0 0 0 0 0 0 -1 ");
    assertEquals("is not consecutive",result);
  }
  @Test
  public void Seriesof7ShouldReturnIsConsecutive1()
  {
    String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("10 23 465");
    assertEquals("is not consecutive",result);
  }


}
