import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");

		int num = entrada.nextInt();

		if (num > 100) {
			System.out.println("o n�mero " + num + " � maior que 100! Somado com mais 150 o resultado � " + (num + 150));
		} else {
			System.out.println("O n�mero " + num + " n�o � maior que 100! tente novamente");
		}
	}
}
