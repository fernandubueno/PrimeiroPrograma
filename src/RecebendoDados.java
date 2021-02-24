import java.util.Scanner;
public class RecebendoDados {

	public static void main(String[] args) {
		
		//A linha abaixo cria um scanner. Um scanner é usado para lermos os dados que o usuário digitar pelo teclado.
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma variável (espaço na memória) para guardarmos um dado. Nesse caso, o nome do usuário.
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome:");
		
		//A linha abaixo lê o texto que o usuário escrever no seu teclado.
		nomeUsuario = leitor.next();
		
		//A linha abaixo exibe o conteúdo da variável. Ela faz isso ao exibir um texto e juntá-lo à variável.
		System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
		
		//Sempre precisamos liberar o scanner após o uso.
		leitor.close();

	}

}
