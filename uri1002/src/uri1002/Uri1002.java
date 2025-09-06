package uri1002;

import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double Pi = 3.14159;
		
		System.out.println("entre com o Raio do circulo : ");
		double raio = sc.nextDouble();
		
		double saida = Pi * Math.pow(raio, 2.00);	
		System.out.printf("Saida : %.2f %n",saida);
				sc.close();
	}

}
