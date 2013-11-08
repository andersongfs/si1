import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TestNumPorExtenso {
	private NumPorExtenso extenso;
	
	@Before
	public void inicio(){
		extenso = new NumPorExtenso();
	}
		
	@Test
	public void testUnidades() throws Exception {
		
		assertEquals("zero", extenso.retornaExtenso(0));
		assertEquals("um", extenso.retornaExtenso(1));
		assertEquals("dois", extenso.retornaExtenso(2));
		assertEquals("tres", extenso.retornaExtenso(3));
		assertEquals("quatro", extenso.retornaExtenso(4));
		assertEquals("cinco", extenso.retornaExtenso(5));
		assertEquals("nove", extenso.retornaExtenso(9));
	}	
	@Test
	public void testDezenas() throws Exception{
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
	}
	@Test
	public void testCentenas() throws Exception{
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
	}
	
	@Test
	public void testMilhar() throws Exception{
		assertEquals("mil", extenso.retornaExtenso(1000));
		assertEquals("mil e um", extenso.retornaExtenso(1001));
		assertEquals("mil e dez", extenso.retornaExtenso(1010));
		assertEquals("mil e cem", extenso.retornaExtenso(1100));
		assertEquals("mil cento e dez", extenso.retornaExtenso(1110));
		assertEquals("mil novecentos e noventa e nove", extenso.retornaExtenso(1999));
		assertEquals("dois mil", extenso.retornaExtenso(2000));
		assertEquals("dois mil e um", extenso.retornaExtenso(2001));
		assertEquals("dois mil e dez", extenso.retornaExtenso(2010));
		assertEquals("dois mil e trezentos", extenso.retornaExtenso(2300));
		assertEquals("dois mil quinhentos e vinte", extenso.retornaExtenso(2520));
		assertEquals("dois mil trezentos e vinte e um", extenso.retornaExtenso(2321));
		assertEquals("noventa e nove mil", extenso.retornaExtenso(99000));
		
		assertEquals("dez mil", extenso.retornaExtenso(10000));
		assertEquals("dez mil e um", extenso.retornaExtenso(10001));
		assertEquals("dez mil e dez", extenso.retornaExtenso(10010));
		assertEquals("dez mil e cem", extenso.retornaExtenso(10100));
		assertEquals("dez mil cento e dez", extenso.retornaExtenso(10110));
		assertEquals("dez mil novecentos e noventa e nove", extenso.retornaExtenso(10999));
		
		assertEquals("novecentos mil", extenso.retornaExtenso(900000));
		assertEquals("novecentos e noventa e nove mil novecentos e noventa e nove", extenso.retornaExtenso(999999));
	}
	
	@Test
	public void testMilhao() throws Exception{
		assertEquals("um milhao", extenso.retornaExtenso(1000000));
		assertEquals("um milhao e um", extenso.retornaExtenso(1000001));
		assertEquals("um milhao e dez", extenso.retornaExtenso(1000010));
		assertEquals("um milhao e cem", extenso.retornaExtenso(1000100));
		assertEquals("um milhao cento e dez mil", extenso.retornaExtenso(1110000));
		assertEquals("um milhao e cem mil", extenso.retornaExtenso(1100000));
		assertEquals("um milhao cento e dez", extenso.retornaExtenso(1000110));
		assertEquals("um milhao dois mil e cem", extenso.retornaExtenso(1002100));
		assertEquals("um milhao dois mil cento e trinta", extenso.retornaExtenso(1002130));

	}
	
	@Test
	public void testBilhao() throws Exception{
		assertEquals("um bilhao", extenso.retornaExtenso(1000000000));
	}
	
	@Test
	public void testLimite(){
		try{
			extenso.retornaExtenso(-2);
		}catch (Exception e) {
			assertEquals("Numero invalido", e.getMessage());
		}
	}

}
