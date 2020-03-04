package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jordi
 *
 */
public class TestASumar {

	/**
	 * si es negativo el espacio queda vacío
	 */
	@Test
	public void testNegativo() {
		ASumar sumi = new ASumar("-1");
		String resultado = sumi.mostrar();
		assertEquals("-1", resultado);
		}
	
}
