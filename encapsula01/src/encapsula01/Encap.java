package encapsula01;

import java.util.Locale;
import java.util.Scanner;

import account.Account;

public class Encap {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		
		System.out.println("Is there na initial deposit (y/n)?");
		char select = sc.next().charAt(0);
		
		if (select == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			 account = new Account(number, holder, balance);
		}else {
			 account = new Account(number, holder);
		}
		
			
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		account.deposit(deposito);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		
		sc.close();
	}

}
