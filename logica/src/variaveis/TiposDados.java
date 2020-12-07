package variaveis;

import javax.swing.JOptionPane;
  //swing = pacote que cont�m recurso para telas
public class TiposDados {

	public static void main(String[] args) {
		
		/*tipos de dados: numerico e alfanumerico;
		 * Num�rico: � o tipo de dados que PODE ser utilizado em express�o aritm�tica ou quando for um
		 * um dado sens�vel para busca;
		 * CEP (no contexto Correios) => 00010009
		 * CPF (contexto da Receita Federal)
		 * N�mero de matr�cula (no contexto de faculdade devido a import�ncia)
		 * Em Javan�s: 
		 *  int => se for n�mero inteiro (qty de alunos na sala;
		 *  double => se for n�meros reais (casa decimais 00,09) 
	
		 * Alfanum�rico:� o tipo de dado que n�o ser� utilizado em c�lculos.
		 * CEP (no contexto DP do Itau) = 00010-009
		 * CPF (no contexto faculdade) 
		 * Em Javanes = String 
		 */
		
		//Criar uma v�riavel: <tipo de dado> <nome da var�ivel> = <valor>
		//somente String vai com ""
		//Classes Wrappers: s�o as classes que apoiam os tipos primitivos:
		//Exemplo:
		//Integer = int
		//Double = double
		//Float = float
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		//ctrl shift O = necess�rio para importar a classe
		//Integer.parseInt
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		double imc = peso / (altura * altura);
		
		//ln muda de linha e vem na frente do print
		
 		System.out.println("Nome: "   + nome);
 		System.out.println("Altura: " + altura);
 		System.out.println("Peso: "   + peso);
 		System.out.println("Idade: "  + idade);
		System.out.println("IMC: "    + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
