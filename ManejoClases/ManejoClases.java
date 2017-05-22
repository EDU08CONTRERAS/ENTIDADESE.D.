package ManejoClases;

import Entidades.*;

public class ManejoClases 
{
	
	public static void main (String []args)
	{
		
		
		
		Vendedor vendedor1 = new Vendedor() ;
		vendedor1.setCodigo(889);
		vendedor1.setApellido("CONTRERAS ZAMBRANO");
		vendedor1.setNombre("MARLON EDU");
		vendedor1.setCiudad("GUAYAQUIL");
		vendedor1.setDireccion("florida mz2 sl45");
		vendedor1.setTelefono("0923453565");
		vendedor1.setFechaDeIngreso("29/Mayo/2016");
		vendedor1.setIdVendedor("12350900000");
		vendedor1.setSueldo(500.50);
		
		
		
		
		Cliente cliente1 = new Cliente() ;
		cliente1 .setCodigo(992200000);
		cliente1 .setApellido(" ZAMBRANO ALVARADO ");
		cliente1 .setNombre("ALISON GABRIELA ");
		cliente1 .setCiudad("CUENCA ");
		cliente1 .setDireccion("GUAYACANES  mz2S sl4545");
		cliente1 .setTelefono("0930975435");
		cliente1.setRuc("0987667677001");
		cliente1.setTipoDeCliente("NUEVO CLIENTE");
		
		
		
		System.out.println("DATOS DEL VENDEDOR #1 ");
		System.out.println("CODIGO :"+vendedor1.getCodigo());
		System.out.println("APELLIDOS :"+vendedor1.getApellido());
		System.out.println("NOMBRES:"+vendedor1.getNombre());
		System.out.println("CIUDAD:"+vendedor1.getCiudad());
		System.out.println("DIRECCION:"+vendedor1.getDireccion());
		System.out.println("TELEFONO:"+vendedor1.getTelefono());
		System.out.println("FechaDeIngreso:"+vendedor1.getFechaDeIngreso());
		System.out.println("IdVendedor:"+vendedor1.getIdVendedor());
		System.out.println("Sueldo:"+vendedor1.getSueldo());
		
		System.out.println("////////////////////////////////////////////");
		System.out.println("////////////////////////////////////////////");
		
		
		System.out.println("DATOS DEL CLIENTE #1 ");
		System.out.println("CODIGO :"+cliente1.getCodigo());
		System.out.println("APELLIDOS :"+cliente1.getApellido());
		System.out.println("NOMBRES:"+cliente1.getNombre());
		System.out.println("CIUDAD:"+cliente1.getCiudad());
		System.out.println("DIRECCION:"+cliente1.getDireccion());
		System.out.println("TELEFONO:"+cliente1.getTelefono());
		System.out.println("RUC:"+cliente1.getRuc());
		System.out.println("TIPO DE CLIENTE :"+cliente1.getTipoDeCliente());
		
		
		
		
		
	}

}
