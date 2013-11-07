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
			String[] arrayDezenas = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
			int num2 = num/10;
			int resto = num%10;
			
			if(resto == 0){
				return String.format("%s", arrayDezenas[num2-2]);
			}else{
				return String.format("%s e %s", arrayDezenas[num2-2], retornaExtenso(resto));
			}
		}
		
		
		
		if (num == 100){
			return "cem";
		}
		
		if (num > 100 && num < 1000){
			String[] arrayCentenas = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"}; 
			int num2 = num/100;
			int resto = num%100;
			
			if(resto == 0){
				return String.format("%s", arrayCentenas[num2-1]);
			}else{
				return String.format("%s e %s", arrayCentenas[num2-1], retornaExtenso(resto));
			}
		}
		
		return null;
	}

	
}
