package estructura;

import static org.junit.Assert.*;

import org.junit.Before;
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
		assertEquals(miTabla.get("nombre"), "luis");
	}

}
