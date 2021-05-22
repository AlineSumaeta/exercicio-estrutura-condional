import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		scanner.close();

	}

}
