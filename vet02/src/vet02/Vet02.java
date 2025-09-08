package vet02;

import java.util.Locale;
import java.util.Scanner;

public class Vet02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		double [] numero = new double[n];
		double soma = 0;
		
		
		for(int i= 0; i <numero.length; i ++) {
			System.out.println("Digite um numero: ");
			numero[i] = sc.nextDouble();
					
		}
		System.out.println("VALORES = ");
		for(int i=0; i < numero.length; i++) {
			soma += numero[i];
			System.out.println(numero[i]);
		}
		System.out.println("soma : "+soma);
		System.out.println(" media : "+soma/numero.length);
		
		
			
		
		sc.close();

	}

}
