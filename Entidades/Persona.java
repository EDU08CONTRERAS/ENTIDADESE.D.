package Entidades;

public class Persona
{
	protected int codigo;

	protected String apellido;
	protected String nombre;
	protected String ciudad;
	protected String direccion;
	protected String telefono;
	
	public Persona ()
	{
		
	}
	
	public Persona (int codigo,String apellido,String nombre,String ciudad,String direccion,String telefono)
	{
		this.codigo=codigo;
		this.apellido=apellido;
		this.nombre=nombre;
		this.ciudad=ciudad;
		this.direccion=direccion;
		this.telefono=telefono;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	
}
