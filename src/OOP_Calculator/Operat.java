package OOP_Calculator;

import OOP_Calculator.Operations.*;
/**
 * Created by Velikiy Dmitriy
 */

// Задание 5 и 7

public class Operat {


    public Operat(String op, double num1, double num2) {

        switch (op) {
            case "+":
                    Sum result1 = new Sum(num1, num2);
                    result1.showResult();
               break;

            case "-":
                Subtraction result2 = new Subtraction(num1, num2);
                result2.showResult();
                break;
            case "*":
                Multiplication result3 = new Multiplication(num1, num2);
                result3.showResult();
                break;
            case "/"://Исключение переехало в class Division

                    Division result4 = new Division(num1, num2);
                    result4.showResult();
                break;
            default:
                System.out.println("Не допустимое значение");


        }
    }
}
