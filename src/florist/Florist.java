package florist;

import java.util.ArrayList;
import java.util.List;

public class Florist {
	private String name;
	private List<Article> stock = new ArrayList<>();
	
	public Florist(String name) throws Exception{
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception{
		if(name == null || name.equals("")) throw new Exception("El nom de la floristeria és incorrecte.");
		this.name = name;
	}
	
	//Public Methods
	public void addArticle(Article article) throws Exception {
		int i = findArticle(article);
		if(i != -1) {
			stock.get(i).setQuantity(stock.get(i).getQuantity()+article.getQuantity());
		} else {
			stock.add(article);
		}
	}
	public int findArticle(Article article) {
		for(int i = 0; i < stock.size(); i++) {
			if(stock.get(i).getName().equalsIgnoreCase(article.getName())) {
				return i;
			}
		}
		return -1;
	}
	public String printFlowers() {
		String sFlowers = "Flors:\n";
		for(Article art : stock) {
			if(art instanceof Flower) {
				sFlowers = sFlowers + "\t- " + art.toString() + "\n";
			}
		}
		return sFlowers;
	}
	public String printTrees() {
		String sTrees = "Arbres:\n";
		for(Article art : stock) {
			if(art instanceof Tree) {
				sTrees = sTrees + "\t- " + art.toString() + "\n";
			}
		}
		return sTrees;
	}
	public String printDecor() {
		String sDecor = "Decoració:\n";
		for(Article art : stock) {
			if(art instanceof Decoration) {
				sDecor = sDecor + "\t- " + art.toString() + "\n";
			}
		}
		return sDecor;
	}
	public String printStock() {
		String sTrees = "Arbres:\n";
		String sFlowers = "Flors:\n";
		String sDecor = "Decoració:\n";
		for(Article art :stock) {
			if(art instanceof Tree) {
				sTrees = sTrees + "\t- " + art.toString() + "\n";
			} else if(art instanceof Flower) {
				sFlowers = sFlowers + "\t- " + art.toString() + "\n";
			} else if(art instanceof Decoration){
				sDecor = sDecor + "\t- " + art.toString() + "\n";
			}
		}
		return "Stock de la floristeria \"" + name + "\":\n" + sTrees + sFlowers + sDecor;
	}
	

}
