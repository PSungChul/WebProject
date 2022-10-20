package factory;

public class ProductMain {
	public static void main(String[] args) {
		ProductRepository pr = new ProductRepository();
		ProductController pc = new ProductController(pr);
		Product snack = new Product(1, "PotatoChips", "2022-10-19");
		Product drink = new Product(2, "Coke", "2022-10-18");
		Product book = new Product(3, "JavaBook", "2022-09-27");
		Product phone = new Product(4, "LZPhone", "2022-09-01");
		Product notebook = new Product(5, "MacBook", "2022-10-10");
		pc.creat(snack);
		pc.creat(drink);
		pc.creat(book);
		pc.creat(phone);
		pc.creat(notebook);
		pc.findAll();
		pc.findById(4);
	}
}
