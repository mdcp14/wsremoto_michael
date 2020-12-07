package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Nivel"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))
					));
		}while (JOptionPane.showConfirmDialog(null, "Continuar", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
			
		System.out.println("Desordenada: " + lista);
		Collections.sort(lista);
		System.out.println ("Ordenada: " + lista);
				
			
			
			/*
			float total = 0;
			float totalJr = 0;
			for (Cargo obj : lista) {
				total+=obj.getSalario();
				if (obj.getNivel().equals("Jr")) {
					totalJr+=obj.getSalario();
				}
			}
			
			System.out.println("Total: " + total);
			System.out.println("Media: " + (total/lista.size()));
			System.out.println("Total Jr:" + totalJr);   */
		}
			

	}


