package GenBr36;

import java.util.Scanner;

public class Questão8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float custFab, c1, c2, valorCons;
		int porcDis, imposto;
		
		porcDis = 28;
		imposto = 45;
		
		System.out.print(" Digite o custo da Fábrica: "); custFab = leia.nextFloat();
		
		c1 = (custFab * porcDis) / 100;
		c2 = (custFab * imposto) / 100;
		
		valorCons = c1 + c2 + custFab;
		
		System.out.printf("\n O valor pago pelo consumidor será de R$%.2f",valorCons);
		
	}
}
