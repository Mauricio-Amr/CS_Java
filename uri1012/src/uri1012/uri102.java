package uri1012;

import java.util.Locale;
import java.util.Scanner;

public class uri102 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digites os valores para A, B C ");
		float a, b, c;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		float areaTriangulo = (a*c)/2;
		double areaCirculo = Math.pow(c, 2) * Math.PI;
		float areaTrapezio = ((a+b)*c)/2;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a*b;
		
		System.out.printf("Triangulo = %.3f%n"
				+ "Circulo = %.3f%n"
				+ "Trapezio = %.3f%n"
				+ "Quadrado = %.3f%n"
				+ "Retangulo = %.3f%n"
				,areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
				
				
				
		
	}

}
