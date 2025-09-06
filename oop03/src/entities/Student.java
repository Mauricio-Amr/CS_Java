package entities;

public class Student {
	
	public String nome;
	public double nota_trimestre1;
	public double nota_trimestre2;
	public double nota_trimestre3;

	public double media() {
		return ((nota_trimestre1)+(nota_trimestre2)+(nota_trimestre3));
	}
	
	public String toString() {
		if (media() > 60) {
			return nome 
					+"%n"
					+"FINAL GRADE : "
					+ String.format("%.2f %n", media())
					+ "PASS";
		}else {
			return nome 
					+"%n"
					+"FINAL GRADE : "
					+ String.format("%.2f %n", media())
					+ "FAILED %n"
					+"MISSING "
					+ (60 - media())
					+" POINTS";
		}
	}
}
