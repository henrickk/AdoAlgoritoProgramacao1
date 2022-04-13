import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double total;

		System.out.println("Digite o valor do consumo de kwh: ");
		double consumo = entrada.nextFloat();

		if (consumo < 150) {
			total = consumo * 0.20;
			System.out.println("Seu consumo de kwh foi de " + consumo);

		} else if (consumo >= 150 && consumo < 500) {
			total = consumo * 0.25;
			System.out.println("Seu consumo de kwh foi de " + consumo);
		} else {
			total = consumo * 0.30;
			System.out.println("Seu consumo de kwh foi de " + consumo);
		}

		if (consumo <= 11.90) {
			System.out.println("Você atingiu o valor minimo de 11,90");
		}

	}
}
