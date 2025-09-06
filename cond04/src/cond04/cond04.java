/*Leia a hora inicial e a hora final de um jogo. 
 * A seguir calcule a duração do jogo, sabendo que o mesmo 
 * pode começar em um dia e terminar em outro, tendo uma 
 * duração mínima de 1 hora e máxima de 24 horas. 
 */


package cond04;

import java.util.Locale;
import java.util.Scanner;

public class cond04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		int duracao;
		
		System.out.println("Digite o  inicio ");
		int inicio = sc.nextInt();
		System.out.println("Digite o  fim ");
		int fim = sc.nextInt();
		
		if (inicio < fim ) {
			duracao = inicio -fim ;
			System.out.println("O JOGO DUROU "+ duracao +" HORAS");
		}else {
			duracao = 24 - inicio + fim ;
			System.out.println("O JOGO DUROU "+ duracao +" HORAS");

		}
				
	}

}
