
/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais.
 */
import java.util.Locale;
import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r, pi, areaCirculo;

		r = sc.nextDouble();
		pi = Math.PI;
		areaCirculo = 2 * pi * r;

		System.out.printf("A área do círculo é: %.4f%n", areaCirculo);
		sc.close();
	}

}
