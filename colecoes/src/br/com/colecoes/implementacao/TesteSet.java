package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("Analista");
		lista.add("PMO");
		lista.add("DEV");
		lista.add("DBA");
		System.out.println(lista);
		//System.out.println(lista.get(0)); nao tem como pegar condicao 
		//Collectiton.sort(lista);
		
		/*
		 * For each = quanod você não quer ou não pode utilizar um indice
		 * */
		
		for (String cargo : lista  ) {
			System.out.println("Cargo: " + cargo);
					

	}

	}
}