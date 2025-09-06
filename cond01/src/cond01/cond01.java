/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
package cond01;

import java.util.Scanner;

public class cond01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		
	}

}
