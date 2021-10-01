package GenBr36;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dia, dias;
		
		System.out.print(" Digite a idade em dias: "); dias = leia.nextInt();
		
		ano = dias / 365;
		mes = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.println("\n Idade igual a "+ano+" anos "+mes+" meses é "+dia+" dias");
		
	}
}
