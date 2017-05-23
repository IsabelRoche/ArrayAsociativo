package estructura;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void tama�oDeTablaVaciaEs0() {
		AsocArray miTabla = new AsocArray();
		assertEquals(miTabla.size(),0);
	}
	
	@Test
	public void tama�oDeTablaConUnPutEs1() {
		AsocArray miTabla = new AsocArray();
		miTabla.put("nombre", "luis");
		assertEquals(miTabla.size(),0);
	}

}
