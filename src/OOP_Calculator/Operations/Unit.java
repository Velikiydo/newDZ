package OOP_Calculator.Operations;

import OOP_Calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;



public class Unit {
    private Calculator Calculator = new Calculator();


    @Test
    public void sumTest() {
        Sum sum = new Sum(2.0, 3.0);
        double actualResult = sum.getResult();
        double expectedResult = 5.0;
        Assert.assertTrue("Ожидаемый результат: \"" + expectedResult + "\" Фактический результат: \"" + actualResult + "\"",
                actualResult == expectedResult);
    }

    //Проверка что сработает исключение
    @Test(expected = ArithmeticException.class)
    public void divisionExceptionTest(){
        Division div = new Division(10.0,0.0);
        div.getResult();

    }

    @Test
    public void subtractionTest() {
        Subtraction sub = new Subtraction(2.0, 3.0);
        double actualResult = sub.getResult();
        double expectedResult = -1.0;
        Assert.assertTrue("Ожидаемый результат: \"" + expectedResult + "\" Фактический результат: \"" + actualResult + "\"",
                actualResult == expectedResult);
    }
    @Test
    public void divisionTest() {
        Division div = new Division(5.0, 2.0);
        double actualResult = div.getResult();
        double expectedResult = 2.5;
        Assert.assertTrue("Ожидаемый результат: \"" + expectedResult + "\" Фактический результат: \"" + actualResult + "\"",
                actualResult == expectedResult);
    }
    @Test
    public void MultiplicationTest() {
        Multiplication mul = new Multiplication(2.0, 3.0);
        double actualResult = mul.getResult();
        double expectedResult = 6.0;
        Assert.assertTrue("Ожидаемый результат: \"" + expectedResult + "\" Фактический результат: \"" + actualResult + "\"",
                actualResult == expectedResult);
    }
}



