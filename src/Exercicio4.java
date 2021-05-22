import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int hora_inicial, hora_final, duracao;
		
		hora_inicial = scanner.nextInt();
		hora_final = scanner.nextInt();
		
		duracao = hora_inicial - hora_final;
		
		if(duracao >= 1 && duracao <= 24) {
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		else {
			System.out.println("Jogo não pode passar de 24 horas");
		}
		
		scanner.close();

	}

}
