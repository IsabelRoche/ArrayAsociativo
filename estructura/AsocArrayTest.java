package estructura;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void tamaņoDeTablaVaciaEs0() {
		AsocArray miTabla = new AsocArray();
		assertEquals(miTabla.size(),1);
	}

}
