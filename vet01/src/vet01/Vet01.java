package vet01;

import java.util.Locale;
import java.util.Scanner;

public class Vet01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");

		int[] numero = new int[sc.nextInt()];

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite um numero: ");
			numero[i] = sc.nextInt();
		}

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] < 0) {
				System.out.println("NUMEROS NEGATIVOS: " + numero[i]);
			}
		}

		sc.close();
	}

}
