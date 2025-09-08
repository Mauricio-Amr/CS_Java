package rep06;

import java.util.Locale;
import java.util.Scanner;

public class Rep06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peso1 =2;
		int peso2 =3;
		int peso3 =5;
		double total = 0;
		double resultado =0;
		
		System.out.println("Digite a quantidade de teste");
		int teste = sc.nextInt();

		for (int i = 0; i < teste; i++) {
			System.out.printf("digite a nota do teste%d%n", i);
			if(i == 0) {
			double nota1 = sc.nextDouble();
			total += nota1*peso1;
			}
			else if(i == 1) {
			double nota2 = sc.nextDouble();
			total += nota2*peso2;

			}
			else if(i == 2) {
			double nota3 = sc.nextDouble();
			total += nota3*peso3;
			}
			resultado = total /(peso1 + peso2+ peso3);
		}
		System.out.printf("resultado : %.2f",resultado);
		

		sc.close();
	}

}
