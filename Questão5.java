package GenBr36;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, p1, p2, p3, pesoTotal, media;
		String nome;
		
		p1 = 2;
		p2 = 3;
		p3 = 5;
		
		System.out.print(" Digite nome do aluno(a): "); nome = leia.nextLine();
		System.out.print(" Digite a primeira nota: "); n1 = leia.nextFloat();
		System.out.print(" Digite a primeira nota: "); n2 = leia.nextFloat();
		System.out.print(" Digite a primeira nota: "); n3 = leia.nextFloat();
		
		pesoTotal = p1 + p2 + p3;
		
		media = (p1*n1 + p2*n2 + p3*n3) / pesoTotal;
		
		System.out.printf("\n A media ponderada do aluno %s é igual a: %.1f",nome,media);

	}
}
