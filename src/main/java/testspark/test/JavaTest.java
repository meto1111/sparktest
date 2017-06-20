package testspark.test;

import junit.framework.*;

public class JavaTest extends TestCase {
   protected int windsnelheid, vermogen;
   
   // assigning the values
   protected void setUp(){
	  windsnelheid = 3;
      vermogen = 3;
   }

   // test method to add two values
   public void testAdd(){
      double result = windsnelheid * vermogen / 0.7;
      assertTrue(result == 12.85);
   }
}