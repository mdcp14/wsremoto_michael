package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu Nome ").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		
		//Vamos fazer um if para condi��o
		//&& = and = e
		//|| = or = ou 
		//!= = not = n�o � igual 
		
		if (idade<16) {
		 System.out.println(nome + "Voc� n�o vota ainda!");
		}
		
		if (idade>= 18 && idade<= 70){
	       System.out.println(nome + "Voc� tem que votar");
		}
	       
		if (idade==16 || idade==17 || idade>70) {
			System.out.println(nome + "O voto � facultativo");
		}
		
		
		
		
		
	}

	}
