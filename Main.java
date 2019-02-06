package florist;

public class Main {

	public static void main(String[] args) throws Exception{
		Florist shop1;
		shop1 = new Florist("Exemple1");
		shop1.addArticle(new Article("Clavell", 10, 2.0, "Flor"));
		shop1.addArticle(new Article("Taronger", 5, 200.0, "Arbre"));
		shop1.addArticle(new Article("Cercat", 100, 20.0, "Decoració"));
		System.out.print(shop1.printStock());
		System.out.print(shop1.printStock2());

	}

}
