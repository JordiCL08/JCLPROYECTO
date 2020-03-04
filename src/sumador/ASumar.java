/**
 * 
 */
package sumador;

/**
 * @author Jordi
 *
 */
public class ASumar {
	
	private String valor_inicial;
	
	
	/**
	 * @param string
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}

	/**
	 * @return va a devolver un valor si es un numero de un digito.
	 */
	public String mostrar() {
		String numero = valor_inicial;
		if(numero.length() == 1) {
				return (numero + "=" + numero);
		}
			return null;
	}
	
}
