package GenBr36;

import java.util.Scanner;

public class Quest�o1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diaA, diaB, mesA, mesB, anoA, anoB, dias = 0;
		
		diaA = 1;
		mesA = 10;
		anoA = 2021;
		
		System.out.print(" Ano que nasceu: "); anoB = leia.nextInt();
		System.out.print(" Mes que nasceu: "); mesB = leia.nextInt();
		System.out.print(" Dia que nasceu: "); diaB = leia.nextInt();
		
		while (anoB < anoA || mesB < mesA || diaB < diaA) {
			dias++;
			diaB++;
			if (diaB > 30) {
				diaB = 1;
				mesB++;
				if (mesB > 12) {
					anoB++;
					mesB = 1;
				}
			}
		}
		System.out.println("\n Voc� viveu CERCA de "+dias+", \\n obs: h� uma perca de 5 dias ao ano, ent�o voc� viveu mais do que o resultado obtido!!");
	}
}
