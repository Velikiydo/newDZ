/**
 * Created by Velikiy Dmitriy
 */
package Podarok;
// Наследуемый класс
public class Candy extends Podarki {
private float ccal;// Уникальный параметр
public Candy(double mass,double price,String name,float ccal){
    super(mass, price, name);
    setCcal(ccal);
}

    public float getCcal() {
        return ccal;
    }

    public void setCcal(float ccal) {
        this.ccal = ccal;
    }

    @Override
    public String toString() {
        return "Конфета: "+getName()+ "| "+"Цена: "+getPrice()+ "| "+"Вес: "+getMass()+"| "+"Каллории "+getCcal();
    }
}
