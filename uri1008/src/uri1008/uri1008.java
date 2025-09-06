package uri1008;

import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {

		int entrada = 0;
		int hora = 0;
		float valor= 0 ;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o cod do funcionario :");
		entrada = sc.nextInt();
		
		System.out.println("Digite a quantidade de hora : ");
		hora =sc.nextInt();
		
		System.out.println("Digite o calor da hora :");
		valor = sc.nextFloat();
		
		float salary = valor*hora;
		
		System.out.printf("Number = %d %n "
				+ "Salary = U$ %.2f",entrada, salary );
	}

}
