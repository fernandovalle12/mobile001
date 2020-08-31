package world_population;

public class world_population {

	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("Insert a number");
        } else {
            long population = 7444333222L;
            int calculator = Integer.parseInt(args[0]);
            System.out.println((calculator * 3500) + population);
        }

	}

}
