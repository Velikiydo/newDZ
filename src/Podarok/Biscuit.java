/**
 * Created by Velikiy Dmitriy
 */
package Podarok;
// Наследуемый класс
public class Biscuit extends Podarki{
    private String filling;// Уникальный параметр

    public Biscuit(double mass,double price, String name,String filling){
        super(mass, price, name);
        setFilling(filling);
    }
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Печенье: "+getName()+"| "+"Цена: "+getPrice()+"| "+ "Вес: "+getMass()+"| "+"Начинка: "+getFilling();
    }
}
