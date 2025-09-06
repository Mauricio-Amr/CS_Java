package uri1003;

import java.util.Scanner;

public class Uri1003{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int number1 = 0;
		int number2 = 0;
		
		System.out.println("Entrada 1 :");
		number1 =sc.nextInt();
		
		System.out.println("Entrada 2 :");
		number2 = sc.nextInt();
		
		int soma = number1 + number2 ;
		
		
		System.out.printf("Soma : %d %n", soma);
			
	
		sc.close();
		

	}

}
