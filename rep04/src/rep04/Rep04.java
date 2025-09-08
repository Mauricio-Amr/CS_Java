package rep04;

import java.util.Locale;
import java.util.Scanner;

public class Rep04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um valor");
		int valor = sc.nextInt();
		
		
		for(int i = 0; i <= valor; i ++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();

	}

}
