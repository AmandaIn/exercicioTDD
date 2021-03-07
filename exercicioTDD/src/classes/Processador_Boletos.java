package classes;

import java.util.ArrayList;

public class Processador_Boletos {
	
	public ArrayList <Boleto> boletos;
	public Fatura fatura;
	public ArrayList <Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	String boleto;
	
	/* ######Método para somar todos os boletos de uma lista de boletos######*/
	
	public double somatorio (ArrayList <Boleto> boletos) {
		
		double valor_boletos = 0;
		
		for (int i = 0; i < boletos.size(); i++) {
			
			valor_boletos += boletos.get(i).getValor_pago();
			
			}
		return valor_boletos;
		
	}
	
	
	/* ######Método para comparar se a soma de todos os boletos de uma lista de boletos é maior, menor ou igual ao valor total de uma fatura######*/
	
	public int compara (ArrayList <Boleto> boletos, Fatura fatura) {
		
		int maior = 1;
		int igual = 0;
		int menor = -1;
		
		if (somatorio(boletos)== fatura.valor_total) {
			
			return igual;
			
		}
		
		else if (somatorio(boletos) > fatura.valor_total) {
			
			return maior;
		}
		
		else
			
			return menor;
		
		
	}
	
	
	
	public Fatura adiciona_pagamento (ArrayList <Boleto> boletos, Fatura fatura) {
		
	//	Pagamento pagamento;
		
		
		
		for (int i=0; i < boletos.size(); i++) {
			
			pagamentos.add(new Pagamento(boletos.get(i).valor_pago, boletos.get(i).data, boleto));
			
		}
		
	
		fatura.setPagamento(pagamentos);
		
		return fatura;
		
		
		
	}
	
	public boolean paga_fatura (ArrayList <Boleto> boletos, Fatura fatura) {
			
		
		if (compara(boletos, fatura)==1 || compara(boletos, fatura)==0) {
						
			return fatura.fatura_paga = true;
						
					}		
		else
			return fatura.fatura_paga = false;
					
		
		
		
	}

	
	

}
