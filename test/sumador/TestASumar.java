package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jordi
 *
 */
public class TestASumar {

	
	/**
	 * comprueba que sea mayor a un dígito
	 */
	@Test
	public void parametromayor() {
		ASumar sumi = new ASumar("9");
		String resultado = sumi.mostrar();
		assertEquals("6 + 6 = 12", resultado);
        }

}
