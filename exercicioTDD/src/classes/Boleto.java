package classes;

public class Boleto {
	
	public String codigo_boleto;
	public String data;
	public Float valor_pago;
	
	
	
	public String getCodigo_boleto() {
		return codigo_boleto;
	}
	public void setCodigo_boleto(String codigo_boleto) {
		this.codigo_boleto = codigo_boleto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Float getValor_pago() {
		return valor_pago;
	}
	public void setValor_pago(Float valor_pago) {
		this.valor_pago = valor_pago;
	}
	
	
	
	public Boleto(String codigo_boleto, String data, Float valor_pago) {
		super();
		this.codigo_boleto = codigo_boleto;
		this.data = data;
		this.valor_pago = valor_pago;
	}
	
	
	
	
	
	

}
