import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int num2 = entrada.nextInt();
	
		int res = num1 / num2;
		
		int resto = num1 % num2;
		
		if (res == 0) {
			System.out.println("A divis�o de " + num1 + " por " + num2 + " � exata");
		}else {
			System.out.println("O resultado da divis�o � igual a " + res);
		}
	}
}
