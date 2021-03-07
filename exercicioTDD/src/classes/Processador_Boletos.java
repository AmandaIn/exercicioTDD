package classes;

import java.util.ArrayList;

public class Processador_Boletos {
	
	public ArrayList <Boleto> boletos;
	public Fatura fatura;
	
	
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
	
	
	
	
	

}
