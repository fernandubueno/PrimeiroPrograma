import java.util.Scanner;

public class Calculadora {
	/*
	 * + Somar
	 * - Subtrair
	 * * Multiplicar
	 * / Dividir
	  */

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int primeiroValor;
		int segundoValor;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("Por favor, digite um valor: ");
		primeiroValor = leitor.nextInt();
		
		System.out.println("Por favor, digite o segundo valor: ");
		segundoValor = leitor.nextInt();
		
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores � " + soma);
		
		subtracao = primeiroValor - segundoValor;
		System.out.println("A subtra��o entre os dois valores � " + subtracao);
		
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A multiplica��o entre os dois valores � " + multiplicacao);
		
		divisao = primeiroValor / (double) segundoValor;
		System.out.println("A divis�o entre os dois valores � " + divisao);
		
		leitor.close();
	

	}

}
