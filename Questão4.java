package GenBr36;

import java.util.Scanner;
import java.math.*;

public class Questão4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Double A, B, C, D, R, S;
		
		System.out.print(" Digite o valor de A: "); A = leia.nextDouble();
		System.out.print(" Digite o valor de B: "); B = leia.nextDouble();
		System.out.print(" Digite o valor de C: "); C = leia.nextDouble();
		
		R = Math.pow(A+B, 2);
		S = Math.pow(B+C, 2);
		D = (R+S) / 2;
		
		System.out.printf("\n O valor de D é igual a: %.2f",D);
		
	}
}
