package ec.edu.ups.tdd.calculator;

public class Calculator {
    public int addition(int a, int b) {
        return a+b;
    }

    public int substracion(int c, int d) {
        return c-d;
    }

    public int division(int e, int f) {
        return e/f;
    }


    public int multiplication(int g, int h)  {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        return g*h;
    }
}
