package cond08;

import java.util.Locale;
import java.util.Scanner;

public class cond08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor <= 2000) {
			System.out.println("INSENTO");
		}
		if (valor > 2000 && valor <= 3000) {
			double taxa = (valor-2000)*0.08;
			System.out.printf("R$ : {%.2f}%n",taxa);
		}
		if (valor > 3000 && valor <= 4500) {
			double taxa = (1000*0.08)+((valor-3000)*0.18);
			System.out.printf("R$ : {%.2f}%n",taxa);
		}
		if (valor > 4500) {
			double taxa = (1000*0.08)+(1500*0.18)+((valor - 4500)*0.28);
			System.out.printf("R$ : {%.2f}%n",taxa);
		}
		
		sc.close();

	}

}
