import java.awt.List;
import java.util.ArrayList;


public class NumPorExtenso {
	
	public NumPorExtenso(){
		
	}

	public String retornaExtenso(int num) {
		String[] array0a9 = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		if (num < 10){
			return array0a9[num];
		}
		return null;
	}
	
	
	
}
