package florist;

public class Tree extends Article {

    Double height;

    public Tree(String name, int quantity, double price, double height) throws Exception{
        super(name, quantity, price);
        if(height <= 0) throw new Exception("l'alçada es incorrecta");
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return (getName() + " d'una alçada " + height + ":"
                + Integer.toString(getQuantity()) + "unitats a "
                + Double.toString(getPrice())+"cadascuna");
    }
}

