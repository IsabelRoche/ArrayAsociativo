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
	public void tama�oDeTablaVaciaEs0() {
		assertEquals(miTabla.size(),0);
	}
	
	@Test
	public void tama�oDeTablaConUnPutEs1() {
		miTabla.put("nombre", "luis");
		assertEquals(miTabla.size(),1);
	}
	
	

}
