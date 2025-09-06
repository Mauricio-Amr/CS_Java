package uri1010;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca = 0;
		int quantidade = 0;
		float valor = 0;
		
		
		int codPeca2 = 0;
		int quantidade2 = 0;
		float valor2 = 0;
		
		System.out.println("Digite o cod da peça :");
		codPeca = sc.nextInt();
		System.out.println("Digite o cod da quantidade :");
		quantidade = sc.nextInt();
		System.out.println("Digite o cod da valor :");
		valor = sc.nextFloat();
		
		
		System.out.println("Digite o cod da peça2 :");
		codPeca2 = sc.nextInt();
		System.out.println("Digite o cod da quantidade2 :");
		quantidade2 = sc.nextInt();
		System.out.println("Digite o cod da valor :");
		valor2 = sc.nextFloat();
		
		
		float valorPagar = quantidade *valor + quantidade2 *valor2;
		
		System.out.printf("vALOR A PAGAR R$ %.2f%n", valorPagar);
				
		
		sc.close();
		
		
		
	}

}
