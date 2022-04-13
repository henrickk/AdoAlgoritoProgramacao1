import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");

		int num = entrada.nextInt();

		if (num > 100) {
			System.out.println("o número " + num + " é maior que 100! Somado com mais 150 o resultado é " + (num + 150));
		} else {
			System.out.println("O número " + num + " não é maior que 100! tente novamente");
		}
	}
}
