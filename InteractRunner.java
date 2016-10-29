import java.util.Scanner;

public class InteractRunner {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			String first, second;
			Calc calc = new Calc();
			String exit = "y";
			while (exit.equals("y")) {
				System.out.println("Enter first arg = ");
				first = reader.next();
				System.out.println("Enter second arg = ");
				second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result = " + calc.getResult());
				calc.clearResult();
				System.out.println("Carry on? (y/n) = ");
				exit = reader.next();
			}
		}
		finally {
			reader.close();
		}
	}
}