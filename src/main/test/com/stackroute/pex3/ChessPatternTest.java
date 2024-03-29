package com.stackroute.pex3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
ChessPattern c1;
  @Before
  public void setUp() throws Exception {
    c1=new ChessPattern();
  }

  @After
  public void tearDown() throws Exception {
    c1=null;

  }

@Test
public void chess8x8()
{

  c1.matrixInitialise(8);
  String result=c1.setChess();
  assertEquals("BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n" +
    "BB WW BB WW BB WW BB WW \n",result);
}
  @Test
  public void chess2x2()
  {

    c1.matrixInitialise(2);
    String result=c1.setChess();
    assertEquals("BB WW \n" +
      "BB WW \n",result);
  }
  @Test
  public void chess4x4()
  {

    c1.matrixInitialise(4);
    String result=c1.setChess();
    assertEquals("BB WW BB WW \n" +
      "BB WW BB WW \n" +
      "BB WW BB WW \n" +
      "BB WW BB WW \n",result);
  }

}
