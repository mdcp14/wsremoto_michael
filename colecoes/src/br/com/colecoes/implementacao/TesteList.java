package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {
//Na lista ele obedece a ordem que foi imputada
	public static void main(String[] args) {
		
		//Cria pela pai e instancia pela filha
		List <String> lista = new ArrayList<String>();
		lista.add("Analista");
		lista.add("Estagiario");
		lista.add("DBA Jr");
		lista.add("DBA Sr"); 
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada:" + lista);
		System.out.println("Segundo Elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Segundo elemento removido: " + lista);
		
		for (int cont=0; cont<lista.size();cont++) {
			System.out.println("Cargo: " + cont + "é" + lista.get(cont));
		}
		
	}

}
