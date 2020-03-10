package uvsq.Exo_gl3;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
	UneClasseMetier metier ;
   @Test
    public void testApp()
    {
	   metier=new UneClasseMetier(new Message());
	   metier.intruction();
    }
}