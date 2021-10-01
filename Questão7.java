package GenBr36;

import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float a, b, c, d, e, f, x, y;

		System.out.print(" Descubra os valores de X e Y \n\n");
		
		System.out.print(" Digite valor de A: "); a = leia.nextFloat();
		System.out.print(" Digite valor de B: "); b = leia.nextFloat();
		System.out.print(" Digite valor de C: "); c = leia.nextFloat();
		System.out.print(" Digite valor de D: "); d = leia.nextFloat();
		System.out.print(" Digite valor de E: "); e = leia.nextFloat();
		System.out.print(" Digite valor de F: "); f = leia.nextFloat();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.printf("\n Os valores são: X = %.2f e Y = %.2f",x,y);
		
	}
}
