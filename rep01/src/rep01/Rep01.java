package rep01;

import java.util.Locale;
import java.util.Scanner;

public class Rep01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha :");
	
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.println("Digite a senha :");
			
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
		
	}

}
