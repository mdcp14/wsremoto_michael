package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int chute = 0;
		int contador=0;
		
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o numero"));
			contador = contador+1;
			if (numero>chute) {
				System.out.println("o numero � maior!");
			}else if (numero<chute) {
				System.out.println("O numero � menor!");
			}
		}while (numero!=chute);
		
		 System.out.println("Parab�ns!!! \nVoc� acertou com " + contador + " tentativa(s)");	 
	
	}

}
