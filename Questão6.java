package GenBr36;

import java.util.Scanner;
import java.math.*;

public class Quest�o6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double x1, x2, y1, y2, P, D;
		
		System.out.print(" Dist�ncia entre P(x1, y1) e P(x2, y2): \n\n");
		System.out.print(" Digite valor de x1: "); x1 = leia.nextFloat();
		System.out.print(" Digite valor de x2: "); x2 = leia.nextFloat();
		System.out.print(" Digite valor de y1: "); y1 = leia.nextFloat();
		System.out.print(" Digite valor de y2: "); y2 = leia.nextFloat();
		
		P = (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
		D = Math.sqrt(P);
		
		System.out.printf("\n A dist�ncia de entre P(x1, y1) e P(x2, y2) �: %.2f", D);
		
	}
}
