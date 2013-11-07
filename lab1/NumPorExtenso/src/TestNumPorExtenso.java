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

	}

}
