package florist;

public abstract class Article {
	private String name;
	private int quantity;
	private double unitPrice;
	
	public Article(String name, int quantity, double price) throws Exception{
		if(name == null || name.equals("")) throw new Exception("El nom de l'article �s incorrecte.");
		this.name = name;
		setQuantity(quantity);
		setPrice(price);
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

	// Setters
	public void setQuantity(int quantity) throws Exception{
		if(quantity < 0) throw new Exception("La quantitat d'articles a afegir �s incorrecta.");
		this.quantity = quantity;
	}
	public void setPrice(double price) throws Exception{
		if(price < 0.0) throw new Exception("El preu de l'article �s incorrecte.");
		this.unitPrice = price;
	}

	@Override
	public abstract String toString();
}
