package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
		float media = (nota1+nota2)/2;
		
		//Vamos fazer um if para condi��o
		//&& = and = e
		//|| = or = ou 
		//!= = not = n�o � igual 
		
		if (media>=6) {
		    System.out.println(nome + "Parab�ns voc� foi aprovado");    		
	}
	
		if (media<4) {
		
			System.out.println(nome + "Infelizmente voc� foi reprovado");
		}
		
		if (media<6 && media>=4) {
			System.out.println(nome + "Voc� ainda tem chance");
			
		}
			
		System.out.println("Sua m�dia foi: " + media);
		}
	
	
}
