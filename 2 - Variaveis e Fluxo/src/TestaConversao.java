
public class TestaConversao {
	public static void main(String [] args) {
		System.out.printf("Casting para tipos primitivos!\n");
		double salario = 1500.75;
		System.out.printf("\nO Salario Atual e de: %.2fR$", salario);
		int novoSalario = (int) salario;
		System.out.printf("\nO novo salario e de: %dR$, porem perdeu a precisao dos 0.75", novoSalario);
	}
}
