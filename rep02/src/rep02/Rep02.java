package rep02;

import java.util.Locale;
import java.util.Scanner;

public class Rep02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para X e Y");
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			System.out.println("Digite o valor para X e Y");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}
