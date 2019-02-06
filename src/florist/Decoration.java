package florist;

public class Decoration extends Article{

    private String material;

    public Decoration (String name, int quantity, double price, String material) throws Exception{
        super(name,quantity, price);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) throws Exception{
    	if(!(material.equalsIgnoreCase("fusta")
                ||(material.equalsIgnoreCase("plastic")))) throw  new Exception("el material es incorrecte");
        this.material = material;
    }

    @Override
    public String toString() {
        return (getName() + ", de " + material.toLowerCase() + ": "
                + Integer.toString(getQuantity()) + " unitats a "
                + Double.toString(getPrice())+" cadascuna");
    }
}
