package vet03;

import java.util.Locale;
import java.util.Scanner;

public class Vet03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double alturaMedia = 0;
		int menores = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i);
			System.out.println("Nome : ");
			nome[i] = sc.next();
			System.out.println("Idade : ");
			idade[i] = sc.nextInt();
			System.out.println("Altura : ");
			altura[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			alturaMedia += altura[i];
		}
		alturaMedia = alturaMedia / altura.length;
		System.out.println("Altura média:" + alturaMedia);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menores += 1;
			}
		}

		int porcetagemMenores = ((menores / idade.length) * 100);
		System.out.println("Pessoas com menos de 16 anos: " + porcetagemMenores);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();

	}
}
