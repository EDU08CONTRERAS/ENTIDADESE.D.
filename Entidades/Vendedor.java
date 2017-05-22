package Entidades;

public class Vendedor extends Persona

{
	private String fechaDeIngreso;
	private String idVendedor;
	private double sueldo;
	
	public Vendedor()
	{
		super();
		
	}
	public Vendedor(int codigo, String apellido, String nombre, String ciudad, String direccion, String telefono)
	{
		super(codigo, apellido, nombre, ciudad, direccion, telefono);
		
		this.fechaDeIngreso=fechaDeIngreso;
		this.idVendedor=idVendedor;
		this.sueldo=sueldo;
	}
	
	
	
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public String getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(String idVendedor) {
		this.idVendedor = idVendedor;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
