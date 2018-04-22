/**
 * Created by Velikiy Dmitriy
 */

package Podarok;

public class NgBox {
    public static void main(String[] args) {

Candy sweet1 = new Candy(100.90,45.99,"Сникерс",11.57f);
Biscuit biscuit1= new Biscuit(150.5,250.99,"Орео","Клубничная");
Car car1=new Car(250.2,850.50,"Форд Мондео",true);
        System.out.println("Новогодий подарок!!! Характеристики подарка");
       //массив с подарками
        Podarki[]ngCase ={sweet1,biscuit1,car1};

       // Определение общего весса подарков
        double mass=0.0;
        for (Podarki inPodarki:ngCase){
            mass+=inPodarki.getMass();
        }
        System.out.printf("Общий вес подарка: %.2f грамм",mass); // Вывод с 2 цифрами после запятой
        System.out.println();
        //Определение цены за коробку
        double Cash=0.0;
        for (Podarki inPodarki:ngCase){
            Cash+=inPodarki.getPrice();
        }
        System.out.printf("Цена за коробку с игрушками : %.2f руб.",Cash);
        System.out.println();
        //Состав подарка
        System.out.println("В подарок за эту цену положили:");
        for (Podarki inPodarki:ngCase){
            System.out.println(inPodarki.toString());
        }
    }

}
