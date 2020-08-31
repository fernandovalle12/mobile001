package sum;

public class sum_two_numbers {

	public static void main(String[] args) {
		if (args.length != 2) {
            System.out.println("Insert two numbers");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println(num1 + num2);
        }

	}

}
