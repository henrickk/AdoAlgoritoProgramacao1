import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu peso: ");
		float peso = entrada.nextFloat();

		System.out.println("Digite sua altura: ");
		float altura = entrada.nextFloat();

		float massa = peso / (altura * altura);

		if (massa < 26) {
			System.out.println("Sua massa é igual a " + massa + " você está normal para seu peso e altura");
		} else if (massa >= 26 && massa < 30) {
			System.out.println("Sua massa é igual a " + massa + " você está obeso para seu peso e altura");
		} else {
			System.out.println("Sua massa é igual a " + massa + " você está com obesidade morbida para seu peso e altura");
		}
	}
}
