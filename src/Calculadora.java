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
		System.out.println("A soma entre os dois valores é " + soma);
		
		subtracao = primeiroValor - segundoValor;
		System.out.println("A subtração entre os dois valores é " + subtracao);
		
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A multiplicação entre os dois valores é " + multiplicacao);
		
		divisao = primeiroValor / (double) segundoValor;
		System.out.println("A divisão entre os dois valores é " + divisao);
		
		leitor.close();
	

	}

}
