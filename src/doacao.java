import java.util.Scanner;
public class doacao {

	public static void main(String[] args) {
		double dolar, reais, donation;
		dolar = 5.6;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua doa��o:");
		donation = leitor.nextDouble();
		
		reais = dolar * donation;
		
		System.out.println("O valor da sua doa��o em reais � de " + reais);
		
		leitor.close();
	

	}

}
