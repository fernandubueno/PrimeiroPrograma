import java.util.Scanner;
public class RecebendoDados {

	public static void main(String[] args) {
		
		//A linha abaixo cria um scanner. Um scanner � usado para lermos os dados que o usu�rio digitar pelo teclado.
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma vari�vel (espa�o na mem�ria) para guardarmos um dado. Nesse caso, o nome do usu�rio.
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome:");
		
		//A linha abaixo l� o texto que o usu�rio escrever no seu teclado.
		nomeUsuario = leitor.next();
		
		//A linha abaixo exibe o conte�do da vari�vel. Ela faz isso ao exibir um texto e junt�-lo � vari�vel.
		System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
		
		//Sempre precisamos liberar o scanner ap�s o uso.
		leitor.close();

	}

}
