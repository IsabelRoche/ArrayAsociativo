package estructura;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void tamañoDeTablaVaciaEs0() {
		AsocArray miTabla = new AsocArray();
		assertEquals(miTabla.size(),0);
	}
	
	@Test
	public void tamañoDeTablaConUnPutEs1() {
		AsocArray miTabla = new AsocArray();
		miTabla.put("nombre", "luis");
		assertEquals(miTabla.size(),0);
	}

}
