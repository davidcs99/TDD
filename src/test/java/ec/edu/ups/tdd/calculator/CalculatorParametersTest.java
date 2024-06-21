package ec.edu.ups.tdd.calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {

    private int a, b, expected;

    @Parameterized.Parameters
    public static  Iterable<Object[]>parameters(){
        List<Object[]> objects =new ArrayList<Object[]>();
        objects.add(new Object[]{5,3,8});
        objects.add(new Object[]{4,8,12});
        objects.add(new Object[]{6,4,10});
        objects.add(new Object[]{9,2,11});
        return objects;
    }
    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test
    public void given_parameters_when_addition_then_ok(){
        Calculator c=new Calculator();
        int actual = c.addition(a,b);
        assertEquals(expected, actual);
    }
}
