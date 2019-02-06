package florist;

public class Flower extends Article {

    private String color;

    public Flower(String name, int quantity, double price, String color) throws Exception{
        super(name, quantity, price);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws Exception{
    	if((color == null)||(color.equals(""))) throw new Exception("El color de la flor es incorrecte");
        this.color = color;
    }

    @Override
    public String toString() {
        return (getName() + " de color " + color + ": "
                + Integer.toString(getQuantity()) + " unitats a "
                + Double.toString(getPrice())+" cadascuna");
    }
}
