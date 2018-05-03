package OOP_Calculator.Operations;
/**
 * Created by Velikiy Dmitriy
 */

// Задание 5 и 7
public class Sum implements Result{
    private double num1;
    private  double num2;
    private double result;


    public Sum (double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
       public double getResult(){
            result = num1 + num2;
            return result;

        }




    @Override
    public void showResult() {
        System.out.printf("Равно=%.4f",getResult());



    }
}
