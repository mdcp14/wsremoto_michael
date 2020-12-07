package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.Cliente;

import br.com.lojaabc.beans.Fabricante;
import br.com.lojaabc.beans.Produto;
import br.com.lojaabc.beans.Venda;
import br.com.lojaabc.util.Magic;

	public static void  main(String[] args) {
		
		Venda venda = new Venda(
				
				Magic.i("Nota Fiscal"),
				
				new Produto(
						Magic.i("Codigo"),
						Magic.s("Descricao"),
						Magic.f("Valor Compra"),
						Magic.f("Valor Venda"),
						Magic.i("Qtde"),
				new Fabricante(
						Magic.s("CNPJ"),
						Magic.s("Razao Social"),
						Magic.s("Fone")		
						),		
						new Cliente(
							Magic.i("Codigo do Cliente"),
							Magic.s("Nome do Cliente"),
							Magic.s("Email"),
							Magic.b("� especial?")
						),
				Magic.i("Qtde"),
				Magic.f("Total")")";
	}
			
				
		
		
		


