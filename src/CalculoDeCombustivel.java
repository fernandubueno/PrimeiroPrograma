import java.util.Scanner;
public class CalculoDeCombustivel {

	public static void main(String[] args) {
		int kmInicial, kmFinal, mediaPorKM, litrosAbastecidos, kmRodados;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quilometragem inicial do painel: ");
		kmInicial = leitor.nextInt();
		
		System.out.println("Digite a quilometragem final do painel: ");
		kmFinal = leitor.nextInt();
		
		System.out.println("Digite quantos litros foram abastecidos no posto de gasolina: ");
		litrosAbastecidos = leitor.nextInt();
		
		kmRodados = kmFinal - kmInicial;
		mediaPorKM = kmRodados / litrosAbastecidos;
		
		System.out.println("O veículo rodou " + kmRodados + " quilometros, e a média por litro que o veículo faz é de " + mediaPorKM + " quilometros por litro.");
		
		leitor.close();
	

	}

}
