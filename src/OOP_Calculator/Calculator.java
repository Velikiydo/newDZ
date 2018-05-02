package OOP_Calculator;

/**
 * Created by Velikiy Dmitriy
 */

// Задание 5 и 7

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean povtor = true;
        while (povtor) {
            try {
                System.out.println("Введите первое число:");
                double num1 = scan.nextDouble();
                System.out.println("Введите втровое число");
                double num2 = scan.nextDouble();
                System.out.println("Введите тип операции:+,-,/,*");
                String op = scan.next();
                Operat oper = new Operat(op, num1, num2);
            } catch (InputMismatchException a) {
                System.err.format("Вы ввели неверный формат!!");
break;
            }
            System.out.println("\nПовтор операции (Y/N)");
            String povtors = scan.next();
            if(povtors.equals("Y")) {
                povtor = true;
            }
            if (povtors.equals("N")){
                povtor=false;
            }

        }


    }
}

