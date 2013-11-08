import java.awt.List;
import java.util.ArrayList;


public class NumPorExtenso {
	String[] array0a19 = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quize", "dezesseis", "dezessete", "dezoito", "dezenove"};

	String[] arrayDezenas = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
	
	public NumPorExtenso(){
 
		
	}

	public String retornaExtenso(int num) {
		 
		if (num >= 0 && num < 20 ){
			return array0a19[num];
		}
		
		
		
		if (num >= 20 && num < 100){
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
		
		
		if (num == 1000){
			return "mil";
		}
		
		if (num > 1000 && num < 1000000){
			int num2 = num/1000;
			int resto = num%1000;
			
			if (resto == 0){
				if(resto <= 19){
					return String.format("%s mil", retornaExtenso(num2));
				}
		
			}
			if (resto != 0){
				if(num2 > 1){
					if(resto < 100 || resto%100 == 0){
						return String.format("%s mil e %s", retornaExtenso(num2), retornaExtenso(resto));
					}
					return String.format("%s mil %s", retornaExtenso(num2), retornaExtenso(resto));
				
				
				}else{
					if(resto < 100 || resto%100 == 0){
						return String.format("mil e %s", retornaExtenso(resto));
					}					
					return String.format("mil %s", retornaExtenso(resto));
				}
			}
			
		}
		
		
		return null;
	}

	
}
