package calculadora;

	import org.junit.Test;

	import junit.framework.TestCase;
	import calculadora.RPN;
	
	/**
	 * 
	 * @author alu20929581h Definimos la clase PruebasRPN
	 *
	 */
	public class PruebaRPN extends TestCase {
	    RPN rpn = new RPN("5 3 2 + +");
	     @Test
	        public void test() {

	           assertEquals(10.0, rpn.resultado());
	        }
	}
