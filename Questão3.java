package GenBr36;

import java.util.Scanner;

public class Quest�o3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.print("\n Digite o tempo em segundos com um n�mero inteiro: "); segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos - (horas * 3600)) / 60;
		segundos = segundos - (horas * 3600) - (minutos * 60);
	
		System.out.print("\n O tempo de dura��o � "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
	}
}