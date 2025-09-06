/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
 * mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
 * indicando se os valores lidos são múltiplos entre si. Atenção: 
 * os números devem poder ser digitados em ordem crescente ou decrescente.
 */

package cond03;

import java.util.Locale;
import java.util.Scanner;

public class cond03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 2 numeros");
		int numero_A = sc.nextInt();
		int numero_B = sc.nextInt();

		if (numero_A % numero_B == 0 || numero_B % numero_A == 0) {
			System.out.println("MULTIPLO");
		}else {
			System.out.println("NÃO É MULTIPLO");
		}

	}

}
