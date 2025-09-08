package rep05;

import java.util.Locale;
import java.util.Scanner;

public class Rep05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;

		System.out.println("digite a quantdades de valores");
		int quantidade = sc.nextInt();

		for (int i = 0; i <= quantidade; i++) {
			System.out.println("Digite um número : ");
			int numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			System.out.println("in : "+in );
			System.out.println("out : "+out);
		}

		sc.close();
	}

}
