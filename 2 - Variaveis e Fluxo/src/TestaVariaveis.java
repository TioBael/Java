
public class TestaVariaveis {
	public static void main(String [] args) {
		int idade = 24;
		System.out.printf("Idade de: %d anos", idade);
		idade += 10;
		System.out.printf("\nIdade + 10: %d", idade);
		idade-=10;
		System.out.printf("\nIdade - 10: %d", idade);
		idade*=10;
		System.out.printf("\nIdade vezes 10: %d",idade);
		idade/=10;
		System.out.printf("\nIdade dividido por 10: %d", idade);
		idade%=5;
		System.out.printf("\nResto da divisão da Idade por 5: %d", idade);
	}
}
