package calculator;

public class calculator {

	public static void main(String[] args) {
		if (args.length != 2) {
            System.out.println("Insert two numbers");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("SUM: " + (num1 + num2));
            System.out.println("PRODUCT: " + (num1 * num2));
            System.out.println("DIFFERENCE: " + (num1 - num2));
            System.out.println("DIVISION: " + (Float.parseFloat(args[0]) / Float.parseFloat(args[1])));
            int maior = num1 > num2 ? num1 : num2;
            System.out.println("HIGHER NUMBER: " + maior);
        }

	}

}
