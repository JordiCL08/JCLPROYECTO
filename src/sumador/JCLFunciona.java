package sumador;


import java.util.Scanner;
/**
 * @author Jordi
 *
 */
public class JCLFunciona {
	
	   /**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			String num = scan.next();
			ASumar suma = new ASumar(num);
			System.out.println(suma.mostrar());
			}

}
