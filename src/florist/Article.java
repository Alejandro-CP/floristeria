package florist;

public class Article {
	private String name;
	private int quantity;
	private double unitPrice;
	private String type;
	
	public Article(String name, int quantity, double price, String type) throws Exception{
		if(name == null || name.equals("")) throw new Exception("El nom de l'article és incorrecte.");
		
		this.name = name;
		setQuantity(quantity);
		setPrice(price);
		setType(type);
	}
	
	// Getters
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return unitPrice;
	}
	public String getType() {
		return type;
	}
	// Setters
	public void setQuantity(int quantity) throws Exception{
		if(quantity < 0) throw new Exception("La quantitat d'articles a afegir és incorrecta.");
		this.quantity = quantity;
	}
	public void setPrice(double price) throws Exception{
		if(price < 0.0) throw new Exception("El preu de l'article és incorrecte.");
		this.unitPrice = price;
	}
	public void setType(String type) throws Exception{
		if(type == null || type.equals("")) throw new Exception("Tipus d'article incorrecte.");
		this.type = type;
	}

}
