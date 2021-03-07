package classes;

import java.util.ArrayList;

public class Fatura {
	
	public String data;
	public double valor_total;
	public String nome_cliente;
	public Boolean fatura_paga;
	ArrayList <Pagamento> pagamento;
	
	
	
		
	public Fatura(String data, double valor_total, String nome_cliente, Boolean fatura_paga,
			ArrayList<Pagamento> pagamento) {
		super();
		this.data = data;
		this.valor_total = valor_total;
		this.nome_cliente = nome_cliente;
		this.fatura_paga = fatura_paga;
		this.pagamento = pagamento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public Boolean getFatura_paga() {
		return fatura_paga;
	}
	public void setFatura_paga(Boolean fatura_paga) {
		this.fatura_paga = fatura_paga;
	}
	public ArrayList<Pagamento> getPagamento() {
		return pagamento;
	}
	public void setPagamento(ArrayList<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
	
	

	
	
}
