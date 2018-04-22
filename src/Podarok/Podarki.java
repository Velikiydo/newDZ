/**
 * Created by Velikiy Dmitriy
 */
package Podarok;
//Класс родитель
public abstract class Podarki {
   private double mass;   /*Общие параметры */
   private double price;
   private String name;

    public Podarki(double mass, double price,String name){
        setMass(mass);
        setPrice(price);
        setName(name);

    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMass() {
        return mass;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String toString();


}
