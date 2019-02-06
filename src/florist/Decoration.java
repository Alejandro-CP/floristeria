package florist;

public class Decoration extends Article{

    String material;

    public Decoration (String name, int quantity, double price, String material) throws Exception{
        super(name,quantity, price);
        if(!(material.equalsIgnoreCase("fusta")
                ||(material.equalsIgnoreCase("plastic")))) throw  new Exception("el material es incorrecte");
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return (getName() + ", de  " + material + ":"
                + Integer.toString(getQuantity()) + "unitats a "
                + Double.toString(getPrice())+"cadascuna");
    }
}
