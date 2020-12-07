package br.com.bankofoz.beans;

public class Corrente extends Conta {
	
	private float limite;
	private float taxa;
	
	public void aumentarLimite (float porc) {
		limite = limite + limite * (porc/100);
	}
	
	
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo()- taxa);
		
	}
	
	
	
	public float verificarSaldo() {
		return super.getSaldo()+ limite;
	}
	
	
	
	public boolean sacar(float valor) {
		if (valor>0 && valor<=(limite + super.getSaldo())) {
			super.setSaldo(super.getSaldo()- valor);
			return true;
		}
		return false;
	}
	
	


	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", taxa=" + taxa + "]";
	}
	public Corrente(float limite, float taxa) {
		
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {

	}
	
	public void setAll(float limite, float taxa) {	
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	
	
	

}
