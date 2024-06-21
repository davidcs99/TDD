package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.additon(3,5)).thenReturn(8);
        assertEquals(8, c.additon(3,5));
    }
    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(13,5)).thenReturn(8);
        assertEquals(8, c.subtraction(13,5));
    }
    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(10,7)).thenReturn(70);
        assertEquals(70, c.multiplication(10,7));
    }
    @Test
    public void given_two_integers_when_division_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(15,5)).thenReturn(3);
        assertEquals(3, c.division(15,5));
    }
}
