package oop02;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Oop02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Employee employee = new Employee();
		
		employee.name = "Joao Silva";
		employee.glossSalary = 6000;
		employee.tax = 1000;
		
		System.out.printf("Employee : "+employee.toString()+"%n");
		System.out.println();
		System.out.println("Which percentage to increase salary? " );
		employee.increaseSalary(10);
		
		System.out.printf("Updated data : "+employee.toString()+"%n");
		
		sc.close();
	}

}
