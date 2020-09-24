import java.util.Scanner;

public class IR {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double salarioBruto, salarioLiquido, aliquota;

		System.out.printf("\nDigite o seu salário: ");
		salarioBruto = t.nextDouble();
		

		if (salarioBruto <= 1903.98)
			aliquota = salarioBruto;
		else if (salarioBruto <= 2826.65)
			aliquota = (salarioBruto * 0.075);
		else if (salarioBruto <= 3751.05)
			aliquota = salarioBruto * 0.15;
		else if (salarioBruto <= 4664.68)
			aliquota = salarioBruto * 0.225;
		else
			aliquota = salarioBruto * 0.275;
		
		salarioLiquido = salarioBruto-aliquota;
		
		System.out.printf("\nSalario Bruto: %.2f\nSalario Liquido: %.2f", salarioBruto, salarioLiquido);
		t.close();
	}
}
