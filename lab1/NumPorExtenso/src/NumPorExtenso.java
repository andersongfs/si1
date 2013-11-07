import java.awt.List;
import java.util.ArrayList;


public class NumPorExtenso {
	
	public NumPorExtenso(){
		
	}

	public String retornaExtenso(int num) {
		String[] array0a19 = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quize", "dezesseis", "dezessete", "dezoito", "dezenove"};
		if (num >= 0 && num < 20 ){
			return array0a19[num];
		}
		
		if (num >= 20 && num < 100){
			int num2 = num/10;
			int resto = num%10;
			
			if (num2 == 2 && resto == 0){
				return "vinte";
			}
			else if(num2 == 2 && resto != 0){
				return String.format("vinte e %s", retornaExtenso(resto));
			}
		}
		return null;
	}

	
}
