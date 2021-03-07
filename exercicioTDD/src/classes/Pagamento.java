package classes;

public class Pagamento {

	double valor_pago;
	String data;
	String tipo;
	
	
		
	public Pagamento(double valor_pago, String data, String tipo) {
		super();
		this.valor_pago = valor_pago;
		this.data = data;
		this.tipo = tipo;
	}
	
	
	public double getValor_pago() {
		return valor_pago;
	}
	public void setValor_pago(double valor_pago) {
		this.valor_pago = valor_pago;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
	
}
