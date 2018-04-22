/**
 * Created by Velikiy Dmitriy
 */
package Podarok;
// Наследуемый класс
public class Car extends Podarki {
    private boolean Colour;// Уникальный параметр

    public Car(double mass, double price, String name,boolean colour) {
        super(mass, price, name);
       setColour(colour);

    }

    public boolean isColour() {
        return Colour;
    }

    public void setColour(boolean colour) {
        Colour = colour;
    }

    @Override
    public String toString() {
        return "Игрушка: "+getName()+"| "+"Цена: "+getPrice()+"| "+ "Вес: "+getMass()+"| "+"Цвет машинки черный: "+isColour();
    }
}

