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
		int index = -1;
		for(int i = 0; i < stock.size(); i++) {
			if(stock.get(i).getName().equalsIgnoreCase(article.getName())) {
				index = i;
				break;
			}
		}
		return index;
	}
	public String printFlowers() {
		String sFlowers = "Flors:\n";
		for(Article art : stock) {
			if(art.getType().equalsIgnoreCase("Flor")) {
				sFlowers = sFlowers + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			}
		}
		return sFlowers;
	}
	public String printTrees() {
		String sTrees = "Arbres:\n";
		for(Article art : stock) {
			if(art.getType().equalsIgnoreCase("Arbre")) {
				sTrees = sTrees + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			}
		}
		return sTrees;
	}
	public String printDecor() {
		String sDecor = "Decoració:\n";
		for(Article art : stock) {
			if(art.getType().equalsIgnoreCase("Decoració")) {
				sDecor = sDecor + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			}
		}
		return sDecor;
	}
	public String printStock() {
		return "Stock de la floristeria \"" + name + "\":\n" + printTrees() + printFlowers() + printDecor();
	}
	
	public String printStock2() {
		String sTrees = "Arbres:\n";
		String sFlowers = "Flors:\n";
		String sDecor = "Decoració:\n";
		String sOthers = "Altres:\n";
		for(Article art :stock) {
			if(art.getType().equalsIgnoreCase("Arbre")) {
				sTrees = sTrees + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			} else if(art.getType().equalsIgnoreCase("Flor")) {
				sFlowers = sFlowers + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			} else if(art.getType().equalsIgnoreCase("Decoració")){
				sDecor = sDecor + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			} else {
				sOthers = sOthers + "\t- " + art.getName() + ": " + art.getQuantity() + "\n";
			}
		}
		return "Stock de la floristeria \"" + name + "\":\n" + sTrees + sFlowers + sDecor + sOthers;
	}
	

}
