
public class TestaPontoFlutuante {
		public static void main(String [] args) {
			double salario = 1250.75;
			System.out.printf("salario de: %.2f Reais", salario);
			salario += 10;
			System.out.printf("\nsalario + 10: %.2f", salario);
			salario-=10;
			System.out.printf("\nsalario - 10: %.2f", salario);
			salario*=10;
			System.out.printf("\nsalario vezes 10: %.2f",salario);
			salario/=10;
			System.out.printf("\nsalario dividido por 10: %.2f", salario);
			salario%=5;
			System.out.printf("\nResto da divisão da salario por 5: %.2f", salario);
		}

}
