package Entidades;

public class Cliente extends Persona 
{
	private String ruc;
	private String tipoDeCliente;
	
	
	
	public Cliente()
	{
		super();
		
	}
	
	public Cliente(int codigo, String apellido, String nombre, String ciudad, String direccion, String telefono)
	
	{
		super(codigo, apellido, nombre, ciudad, direccion, telefono);
		
	    this.ruc=ruc;
	    this.tipoDeCliente=tipoDeCliente;
	}
	
	
	
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTipoDeCliente() {
		return tipoDeCliente;
	}
	public void setTipoDeCliente(String tipoDeCliente) {
		this.tipoDeCliente = tipoDeCliente;
	}
	
	
	
	
	
	

}
