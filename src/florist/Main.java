package florist;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Florist shop1= new Florist("Exemple1");
		shop1.addArticle(new Flower("Clavell", 10, 2.0, "Blanc"));
		shop1.addArticle(new Tree("Taronger", 5, 200.0, 10));
		shop1.addArticle(new Decoration("Cercat", 100, 20.0, "Fusta"));
		printStock(shop1);

	}
	
	private static void printFlowers(Florist shop) {
		System.out.println("Flors:");
		for(Article flower : shop.getFlowers()) {
			System.out.println("\t- " + flower.getArticleInformation());
		}
	}
	private static void printTrees(Florist shop) {
		System.out.println("Flors:");
		for(Article tree : shop.getTrees()) {
			System.out.println("\t- " + tree.getArticleInformation());
		}
	}
	private static void printDecoration(Florist shop) {
		System.out.println("Decoració:");
		for(Article decoration : shop.getDecoration()) {
			System.out.println("\t- " + decoration.getArticleInformation());
		}
	}
	private static void printStock(Florist shop) {
		System.out.println("Stock:");
		printTrees(shop);
		printFlowers(shop);
		printDecoration(shop);
	}

}
