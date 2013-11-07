import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class TestNumPorExtenso {

	@Test
	public void test() {
		NumPorExtenso extenso = new NumPorExtenso();
		assertTrue(extenso.retornaExtenso(0) == "zero");
		assertTrue(extenso.retornaExtenso(1) == "um");
		assertTrue(extenso.retornaExtenso(2) == "dois");
	}

}
