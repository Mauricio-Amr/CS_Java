package rep03;

import java.util.Locale;
import java.util.Scanner;

public class Rep03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int combustivel = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (combustivel != 4) {
			System.out.printf("Digite o combustivel abatecido %n" + " 1.Álcool : %d %n" + " 2.Gasolina: %d %n"
					+ " 3.Diesel %d %n" + " 4.Fim", alcool, gasolina, diesel);
			combustivel = sc.nextInt();

			if (combustivel == 1) {
				alcool += 1;
			}
			else if (combustivel == 2) {
				gasolina += 1;
			}
			else if (combustivel == 3) {
				diesel += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		sc.close();
	}

}
