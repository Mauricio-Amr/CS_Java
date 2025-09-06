/*Com base na tabela abaixo, escreva um programa que leia o código de um
 * item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * 
 * codigo | especificação | valor
 * 1 | cachorro quente | R$ 4,00
 * 2 | X - salada | R$ 4,50
 * 3 | X - Bacon | R$ 5,00
 * 4 | Torrada simple | R$ 2,00
 * 5 | Refrigerante | R$ 1,50
 * 
 * */

package cond05;

import java.util.Locale;
import java.util.Scanner;

public class cond05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor = 0;
		System.out.printf("1 | cachorro quente | R$ 4,00%n" + "2 | X - salada | R$ 4,50%n" + "3 | X - Bacon | R$ 5,00%n"
				+ "4 | Torrada simple | R$ 2,00%n" + "5 | Refrigerante | R$ 1,50");
		System.out.println();
		System.out.println("Digite seu pedido e quantidade");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		if (codigo == 1) {
			valor += quantidade * 4.00;
		}
		if (codigo == 2) {
			valor += quantidade * 4.50;

		}
		if (codigo == 3) {
			valor += quantidade * 5.00;

		}
		if (codigo == 4) {
			valor += quantidade * 2.00;

		}
		if (codigo == 5) {
			valor += quantidade * 1.5;

		}
		System.out.println();
		System.out.println();
		System.out.println("Valor a ser Pago " + valor);
		sc.close();
	}
}
