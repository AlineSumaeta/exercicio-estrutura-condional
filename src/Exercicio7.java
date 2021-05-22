import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double x, y;
		
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		
		if (x == 0.0 && y == 0.0 ) {
			System.out.println("Origem");
		}
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		scanner.close();

	}

}
