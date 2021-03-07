package classes;

import java.util.ArrayList;

public class Processador_Boletos {
	
	public ArrayList <Boleto> boletos;
	
	
	
	public double somatorio (ArrayList <Boleto> boletos) {
		
		double valor_boletos = 0;
		
		for (int i = 0; i < boletos.size(); i++) {
			
			valor_boletos += boletos.get(i).getValor_pago();
			
			}
		return valor_boletos;
		
	}
	
	
	

}
