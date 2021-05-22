import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double codigo, quantidade, total;
		
		System.out.println("Insira o codigo do produto e em seguida a quantidade: ");
		
		codigo = scanner.nextDouble();
		quantidade = scanner.nextDouble();
		
		if(codigo == 1) {
			
			total = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f ", total);	
		}
		else if(codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f ",total);	
		}
		else if(codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f ", total);	
		}
		else if(codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f ", total);	
		}
		else if(codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f ", total);	
		}
		else {
			System.out.println("Código invalido");
		}
		
		scanner.close();
	}

}
