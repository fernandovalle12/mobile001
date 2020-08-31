package invoice;

public class main {

	public static void main(String[] args) {
		int qt = Integer.parseInt(args[0]);
        float price = Float.parseFloat(args[1]);
        Invoice invoice1 = new Invoice(qt, price, args[2], args[3]);
        invoice1.imprime();
	}

}
