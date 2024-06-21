package ec.edu.ups.tdd.calculator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c =null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Inicia el test");
    }

    @Before
    public  void setUp(){
        c =new Calculator();
        System.out.println("Ejecución de setUp");
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(60, c.addition(10,50));
        System.out.println("Ejecución de Test1");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(14, c.substracion(60,46));
        System.out.println("Ejecución de Test 2");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        assertEquals(2, c.division(10,0));
        System.out.println("Ejecución de Test 3");
    }

    @Test(timeout = 100)
    public void given_two_integers_when_multiplication_then_exception(){
        assertEquals(20, c.multiplication(10,2));
        System.out.println("Ejecución de Test 4");
    }

    @AfterClass
    public static void endClass(){
        System.out.println("Finaliza el test");
    }
}
