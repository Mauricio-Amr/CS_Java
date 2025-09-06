package uri1007;

import java.util.Scanner;

public class uri1007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor para ");
		System.out.println("A :");
		int a = sc.nextInt();
		
		System.out.println("B :");
		int b = sc.nextInt();
		
		System.out.println("D :");
		int c = sc.nextInt();
		
		System.out.println("D :");
		int d = sc.nextInt();
		
		int diferenca = (a * b - c * d);
		System.out.printf("diferenca : %d %n", diferenca);
		
		sc.close();
		
	}

}
