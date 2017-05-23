package estructura;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void tamaņoDeTablaVaciaEs0() {
		AsocArray miTabla = new AsocArray();
		assertEquals(miTabla.size(),0);
	}
	
	@Test
	public void tamaņoDeTablaConUnPutEs1() {
		AsocArray miTabla = new AsocArray();
		miTabla.put("nombre", "luis");
		assertEquals(miTabla.size(),1);
	}

}
