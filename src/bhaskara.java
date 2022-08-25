/*
 * Fórmula de Bhaskara
 */
public class bhaskara {

	public static void main(String[] args) {
		int a = 2;
		int b = -7;
		int c = 3;
		double delta;
		double x1;
		double x2;
		
		delta = Math.pow(b, 2.0) -4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.println("X1 é igual a " + x1);
		System.out.println("X2 é igual a " + x2);
	}

}
