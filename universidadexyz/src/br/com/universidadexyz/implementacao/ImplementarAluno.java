package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCpf(JOptionPane.showInputDialog("CPF:"));
		aluno.setNome(JOptionPane.showInputDialog("Nome:").toUpperCase());
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM:")));
		
		System.out.println("Nome:  " + aluno.getNome());
		System.out.println("CPF:   " + aluno.getCpf());
		System.out.println("Rm:    " + aluno.getRm());
		
		
		
		
		
		

	}

}
