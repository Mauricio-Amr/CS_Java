package oop03;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Oop03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		Student student =  new Student();
		
		student.nome = "Alex Green";
		student.nota_trimestre1 = 17.00;
		student.nota_trimestre2 = 20.00;
		student.nota_trimestre3 = 15.00;
		
		System.out.printf(student.toString());

		sc.close();
		
	}

}
