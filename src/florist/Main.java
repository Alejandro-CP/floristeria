package florist;

public class Main {

	public static void main(String[] args) throws Exception{
		Florist shop1;
		shop1 = new Florist("Exemple1");
		shop1.addArticle(new Flower("Clavell", 10, 2.0, "Blanc"));
		shop1.addArticle(new Tree("Taronger", 5, 200.0, 10));
		shop1.addArticle(new Decoration("Cercat", 100, 20.0, "Fusta"));
		System.out.print(shop1.printStock());

	}

}
