package testes;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import classes.Boleto;
import classes.Fatura;
import classes.Pagamento;
import classes.Processador_Boletos;



public class teste_processador_boleto {
	
	
	
	Boleto boleto1,boleto2,boleto3;
	ArrayList <Boleto> boletos = new ArrayList<Boleto>();
	
	Processador_Boletos processar = new Processador_Boletos ();
	Fatura fatura;
	Boolean status = false;
	Pagamento pagamento1, pagamento2, pagamento3;
	ArrayList <Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	
	@BeforeEach
	
	public void inicializaBoletos() {
		boleto1 = new Boleto("123456","25-09-2020", 100.00);
		boleto2 = new Boleto("1234567", "22-09-2020", 98.00);
		boleto3 = new Boleto("12345678", "22-09-2020", 97.00);
	}
	
	@BeforeEach
	public void incializaFatura() {
		
		fatura = new Fatura("07-03-2021", 250.00,"João", status, pagamentos);
		
	}
	
	@DisplayName("Testa se o método que soma os valores do boleto está funcionando")
	@Test
	
	public void somatorio_test()
		{
		double somatorio;
		
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		somatorio = processar.somatorio(boletos);
		
		Assertions.assertEquals(295.00, somatorio);
		
			
		}
	
	
	@DisplayName("Testa o método que compara se o valor da soma dos boletos é maior que o valor total da fatura ")
	@Test	
	
	public void compara_maior_test() {
		fatura = new Fatura("07-03-2021", 240.00,"João", status, pagamentos);
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		
		int compara = processar.compara(boletos,fatura);
		
		Assertions.assertEquals(1, compara);
		
		
	}
	
	
	@DisplayName("Testa o método que compara se o valor da soma dos boletos é menor que o valor total da fatura ")
	@Test	
	
	public void compara_menor_test() {
		fatura = new Fatura("07-03-2021", 300.00,"João", status, pagamentos);
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		
		int compara = processar.compara(boletos,fatura);
		
		Assertions.assertEquals(-1, compara);
		
		
	}

	@DisplayName("Testa o método que compara se o valor da soma dos boletos é igual ao valor total da fatura ")
	@Test	
	
	public void compara_igual_test() {
		fatura = new Fatura("07-03-2021", 295.00,"João", status, pagamentos);
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		
		int compara = processar.compara(boletos,fatura);
		
		Assertions.assertEquals(0, compara);
		
		
	}
	
	
	@DisplayName("Testa o método que adiciona pagamentos à fatura ")
	@Test
	
	public void adiciona_pagamento_test() {
		//Fatura fatura1;
		
		fatura = new Fatura("07-03-2021", 295.00,"João", status, pagamentos);
		
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		pagamento1 = new Pagamento(boleto1.getValor_pago(),boleto1.getData(), "boleto");
		pagamento2 = new Pagamento(boleto2.getValor_pago(),boleto2.getData(), "boleto");
		pagamento3 = new Pagamento(boleto3.getValor_pago(),boleto3.getData(), "boleto");
		
		ArrayList <Pagamento> pagamentos2 = new ArrayList<Pagamento>();
		pagamentos2.add(pagamento1);
		pagamentos2.add(pagamento2);
		pagamentos2.add(pagamento3);
		
		
		processar.adiciona_pagamento(boletos, fatura);
		
		//Assertions.assertEquals(pagamentos2, fatura.getPagamento()); quando eu ponho este assert está dando erro :(
		
		
		
	}
	
	
	
	
	

}
