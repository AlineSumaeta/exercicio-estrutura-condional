import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		numero = scanner.nextInt();
		
		if(numero >= 0) {
			System.out.println("N�o negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		scanner.close();

	}

}
