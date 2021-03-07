package testes;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import classes.Boleto;
import classes.Processador_Boletos;



public class teste_processador_boleto {
	
	
	Boleto boleto1,boleto2,boleto3;
	ArrayList <Boleto> boletos = new ArrayList<Boleto>();
	
	Processador_Boletos processar = new Processador_Boletos ();
	
	@BeforeEach
	
	public void inicializaBoletos() {
		boleto1 = new Boleto("123456","25-09-2020", 100.00);
		boleto2 = new Boleto("1234567", "22-09-2020", 98.00);
		boleto3 = new Boleto("12345678", "22-09-2020", 97.00);
	}
	
	@DisplayName("Testa se função que soma os valores do boleto está funcionando")
	@Test
	
	public void somatorio_test()
		{
		Double somatorio;
		
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		somatorio = processar.somatorio(boletos);
		
		Assertions.assertEquals(295.00, somatorio);
		
			
		}
		
	
	

}
