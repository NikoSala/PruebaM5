import static org.junit.Assert.*;

import org.junit.Test;


public class SumaTest {
	Suma obj = new Suma();
	@Test
	public void testSuma() {
		double resultado = obj.suma(5, 7);
		assertEquals("Resultado esperado: 12",17,resultado,1e-6);
	}
	
	@Test
	public void testSumas(){
		double resultado = obj.sumas(9);
		assertEquals("Resultado esperado: 10",10,resultado,1e-6);
	}

}
