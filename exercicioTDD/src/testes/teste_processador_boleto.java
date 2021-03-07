package testes;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import classes.Boleto;
import classes.Fatura;
import classes.Processador_Boletos;



public class teste_processador_boleto {
	
	
	
	Boleto boleto1,boleto2,boleto3;
	ArrayList <Boleto> boletos = new ArrayList<Boleto>();
	
	Processador_Boletos processar = new Processador_Boletos ();
	Fatura fatura;
	Boolean status = false;
	
	@BeforeEach
	
	public void inicializaBoletos() {
		boleto1 = new Boleto("123456","25-09-2020", 100.00);
		boleto2 = new Boleto("1234567", "22-09-2020", 98.00);
		boleto3 = new Boleto("12345678", "22-09-2020", 97.00);
	}
	
	@BeforeEach
	public void incializaFatura() {
		
		fatura = new Fatura("07-03-2021", 250.00,"João", status);
		
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
		fatura = new Fatura("07-03-2021", 240.00,"João", status);
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		
		int compara = processar.compara(boletos,fatura);
		
		Assertions.assertEquals(1, compara);
		
		
	}
	
	
	

	

}
