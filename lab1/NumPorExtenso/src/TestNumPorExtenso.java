import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class TestNumPorExtenso {

	@Test
	public void test() {
		NumPorExtenso extenso = new NumPorExtenso();
		assertEquals("zero", extenso.retornaExtenso(0));
		assertEquals("um", extenso.retornaExtenso(1));
		assertEquals("dois", extenso.retornaExtenso(2));
		assertEquals("tres", extenso.retornaExtenso(3));
		assertEquals("quatro", extenso.retornaExtenso(4));
		assertEquals("cinco", extenso.retornaExtenso(5));
		assertEquals("nove", extenso.retornaExtenso(9));
		assertEquals("dezenove", extenso.retornaExtenso(19));
		assertEquals("vinte", extenso.retornaExtenso(20));
		assertEquals("vinte e um", extenso.retornaExtenso(21));
		assertEquals("vinte e nove", extenso.retornaExtenso(29));

		assertEquals("trinta", extenso.retornaExtenso(30));
		assertEquals("trinta e um", extenso.retornaExtenso(31));
		assertEquals("trinta e nove", extenso.retornaExtenso(39));
		
		assertEquals("quarenta", extenso.retornaExtenso(40));
		assertEquals("quarenta e um", extenso.retornaExtenso(41));
		assertEquals("quarenta e nove", extenso.retornaExtenso(49));
		
		assertEquals("noventa", extenso.retornaExtenso(90));
		assertEquals("noventa e um", extenso.retornaExtenso(91));
		assertEquals("noventa e nove", extenso.retornaExtenso(99));
		
		assertEquals("cem", extenso.retornaExtenso(100));
		assertEquals("cento e um", extenso.retornaExtenso(101));
		assertEquals("cento e dez", extenso.retornaExtenso(110));
		assertEquals("cento e noventa e nove", extenso.retornaExtenso(199));
		
		assertEquals("duzentos", extenso.retornaExtenso(200));
		assertEquals("duzentos e um", extenso.retornaExtenso(201));
		assertEquals("duzentos e dez", extenso.retornaExtenso(210));
		assertEquals("duzentos e noventa e nove", extenso.retornaExtenso(299));
		
		assertEquals("novecentos", extenso.retornaExtenso(900));
		assertEquals("novecentos e um", extenso.retornaExtenso(901));
		assertEquals("novecentos e dez", extenso.retornaExtenso(910));
		assertEquals("novecentos e noventa e nove", extenso.retornaExtenso(999));
		
		assertEquals("mil", extenso.retornaExtenso(1000));
		assertEquals("mil e um", extenso.retornaExtenso(1001));
		assertEquals("mil e dez", extenso.retornaExtenso(1010));
		assertEquals("mil e cem", extenso.retornaExtenso(1110));
		assertEquals("mil novecentos e noventa e nove", extenso.retornaExtenso(1999));
	}

}
