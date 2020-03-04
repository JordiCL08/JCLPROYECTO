package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jordi
 *
 */
public class TestASumar {

	/**
	 *
	 * Si el resultado es = 7 sera valida 
	 */
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("7");
		String resultado = sumi.mostrar();
		assertEquals("7=7",resultado);
	}

	/*
	 * si es negativo el espacio queda vac�o
	 */
	@Test
	public void testNegativo() {
		ASumar sumi = new ASumar("-1");
		String resultado = sumi.mostrar();
		assertEquals("", resultado);
		}
	

}
