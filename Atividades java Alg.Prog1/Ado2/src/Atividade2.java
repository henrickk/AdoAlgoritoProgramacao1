import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = entrada.nextInt();
	
		int res = num1 / num2;
		
		int resto = num1 % num2;
		
		if (res == 0) {
			System.out.println("A divisão de " + num1 + " por " + num2 + " é exata");
		}else {
			System.out.println("O resultado da divisão é igual a " + res);
		}
	}
}
