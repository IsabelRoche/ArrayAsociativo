package estructura;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void tama�oDeTablaVaciaEs0() {
		AsocArray miTabla = new AsocArray();
		assertEquals(miTabla.size(),0);
	}

}
