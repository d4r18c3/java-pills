
/*
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, 
 * bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o 
 * valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais.
 * Valores de entrada: 10.0, 30.0, 200.00
 */
import java.util.Locale;
import java.util.Scanner;

public class areaPrecoTerreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, precoMetroQuadrado, area, precoTotal;

		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		precoMetroQuadrado = sc.nextDouble();

		area = largura * comprimento;
		precoTotal = area * precoMetroQuadrado;

		System.out.printf("Área: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", precoTotal);

	}

}
