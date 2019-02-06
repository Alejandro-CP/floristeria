package florist;

public class Flower extends Article {

    String color;

    public Flower(String name, int quantity, double price, String color) throws Exception{
        super(name, quantity, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return (getName() + " de color " + color + ":"
                + Integer.toString(getQuantity()) + "unitats a "
                + Double.toString(getPrice())+"cadascuna");
    }
}
