package estructura;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class AsocArrayTest {
	
	AsocArray miTabla;
	
	@Before
	public void setUp(){
		miTabla = new AsocArray();
	}

	@Test
	public void tamañoDeTablaVaciaEs0() {
		assertEquals(miTabla.size(),0);
	}
	
	@Test
	public void tamañoDeTablaConUnPutEs1() {
		miTabla.put("nombre", "luis");
		assertEquals(miTabla.size(),1);
	}
	
	@Test
	public void tamañoDeTablaCon3PutEs3(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		assertEquals(miTabla.size(), 3);
	}
	
	@Test
	public void cambiamosNombreConPut() throws UndefinedKeyException{
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");
		miTabla.put("nombre", "mariana");
		assertEquals(miTabla.size(), 4);
		assertEquals(miTabla.get("nombre"), "mariana");
	}
	
	@Test (expected = UndefinedKeyException.class)
	public void pedimosUnaClaveQueNoExisteDevuelveExcepcion() throws Exception {
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");
		
		miTabla.get("noexiste");
	}
	
	@Test
	public void pedimosClaveQueExisteAMetodoGetOrElse(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");

		String porDefecto = "defecto";
		assertEquals(miTabla.getOrElse("apellido", porDefecto), "martin");
	}
	
	@Test
	public void pedimosClaveQueNoExisteAMetodoGetOrElse(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");

		String porDefecto = "defecto";
		assertEquals(miTabla.getOrElse("noexiste", porDefecto), porDefecto);
	}
	
	@Test
	public void comprobamosQueExisteUnaClaveQuePedimos(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");
		
		assertEquals(miTabla.containsKey("telefono"),true);
	}
	
	@Test
	public void comprobamosQueNoExisteUnaClaveQuePedimos(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");
		
		assertEquals(miTabla.containsKey("noexiste"),false);
	}
	
	@Test
	public void comprobamosQueSeBorraUnCampoCorrectamente(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");
		
		assertEquals(miTabla.containsKey("nombre"), true);
		assertEquals(miTabla.remove("nombre"), true);
		assertEquals(miTabla.containsKey("nombre"), false);
	}
	
	@Test
	public void comprobamosQueNoSeBorraUnCampoQueNoExistía(){
		miTabla.put("nombre", "luis");
		miTabla.put("apellido", "martin");
		miTabla.put("dni", "12345678A");
		miTabla.put("telefono", "765123233");
		
		assertEquals(miTabla.containsKey("noexiste"), false);
		assertEquals(miTabla.remove("nombre"), false);
		assertEquals(miTabla.containsKey("noexiste"), false);
	}
}
