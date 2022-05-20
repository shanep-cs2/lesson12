package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MyMathTest {

  @Test
  public void testGoodInput(){
      int actual = MyMath.divide("10", "2");
      assertEquals(actual, 5);
  }

  @Test(expectedExceptions = {ArithmeticException.class})
  public void testDivideByZero(){
      MyMath.divide("10", "0");
  }

  @Test(expectedExceptions = {NumberFormatException.class})
  public void testFloat(){
      MyMath.divide("10.2", "2");
  }

  @Test(expectedExceptions = {NumberFormatException.class})
  public void testFloat2(){
      MyMath.divide("10", "2/2");
  }

  @Test(expectedExceptions = {NumberFormatException.class})
  public void testBadInput(){
      MyMath.divide("foo", "bar");
  }

  @Test(expectedExceptions = {NumberFormatException.class})
  public void testEmptyString(){
      MyMath.divide("", "");
  }

  @Test(expectedExceptions = {NumberFormatException.class})
  public void testNullString(){
      MyMath.divide(null, null);
  }
    
}
