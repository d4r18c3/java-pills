import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa.
 */
public class soma {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, soma;

		valor1 = sc.nextInt();
		valor2 = sc.nextInt();

		soma = valor1 + valor2;
		System.out.println("Soma: " + soma);

	}

}
