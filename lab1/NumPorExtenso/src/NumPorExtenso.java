import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class NumPorExtenso {
	
	private String[] array0a19;
	private String[] arrayDezenas;
	private String[] arrayCentenas;
	
	public NumPorExtenso(){
		array0a19 = new String[] {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quize", "dezesseis", "dezessete", "dezoito", "dezenove"};
		arrayDezenas = new String[] {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
		arrayCentenas = new String[] {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"}; 
	}

	public String retornaExtenso(int num) throws Exception {
		
		//Unidade e dezena
		if (num >= 0 && num < 100){
			return uniEDez(num);
		}
		
		//centena
		if (num >= 100 && num < 1000){
			return centena(num);
		}		
		
		//milhar
		if (num >= 1000 && num < 1000000){
			return milhar(num);
		}		
		
		//milhao
		if (num >= 1000000 && num < 1000000000){
			return milhao(num);
		}
		
		//bilhao
		if (num == 1000000000){
			return "um bilhao";
		}
		
		throw new Exception("Numero invalido");
		

	
	}
	
	public String uniEDez(int num) throws Exception{
		if (num >= 0 && num < 20 ){
			return array0a19[num];
		}		
		
		int num2 = num/10;
		int resto = num%10;
			
		if(resto == 0){
			return String.format("%s", arrayDezenas[num2-2]);
		}else{
			return String.format("%s e %s", arrayDezenas[num2-2], retornaExtenso(resto));
		}
		
	}
	
	public String centena(int num) throws Exception{
		if (num == 100){
			return "cem";
		}	
			
		int num2 = num/100;
		int resto = num%100;
			
		if(resto == 0){
			return String.format("%s", arrayCentenas[num2-1]);
		}else{
			return String.format("%s e %s", arrayCentenas[num2-1], retornaExtenso(resto));
		}
		
	}
	
	public String milhar(int num) throws Exception{
		if (num == 1000){
			return "mil";
		}
		

		int num2 = num/1000;
		int resto = num%1000;
			
		if (resto == 0 && resto <= 19){
			return String.format("%s mil", retornaExtenso(num2));
			
		
		}

		if(num2 > 1){
			if(resto < 100 || resto%100 == 0){
				return String.format("%s mil e %s", retornaExtenso(num2), retornaExtenso(resto));
			}
			return String.format("%s mil %s", retornaExtenso(num2), retornaExtenso(resto));
			
			
		}
		if(resto < 100 || resto%100 == 0){
			return String.format("mil e %s", retornaExtenso(resto));
		}					
		return String.format("mil %s", retornaExtenso(resto));
				
	}
	
	public String milhao(int num) throws Exception{
		if(num == 1000000){
			return "um milhao";
		}
		int num2 = num/1000000;
		int restoEmCMilhar = num%1000000;
		int restoEmDMilhar = restoEmCMilhar%100000;
		int restoEmUMilhar = restoEmDMilhar%1000000;
		int restoUMilhar =   restoEmDMilhar%1000;

		if(num2 == 1){
			
			if(restoEmCMilhar <= 100){ 
				return String.format("%s milhao e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
			}
			if(restoEmDMilhar == 0){
				return String.format("%s milhao e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
			}
			if(restoEmUMilhar == 0){
				return String.format("%s milhao e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
			}

			if(restoEmCMilhar == 0 && restoEmDMilhar == 0 && restoEmUMilhar == 0){
				return String.format("%s milhao e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));

			}
			if(restoEmCMilhar == 0 && restoEmDMilhar == 0 ){ 
				return String.format("%s milhao e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));

			}
			if(restoEmCMilhar == 0){ 
				return String.format("%s milhao e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));

			}
			return String.format("%s milhao %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));		
		
		}else{
			if(restoEmCMilhar <= 100){ 
				return String.format("%s milhoes e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
			}
			if(restoEmDMilhar == 0){
				return String.format("%s milhoes e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
			}
			if(restoEmUMilhar == 0){
				return String.format("%s milhoes e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
			}

			if(restoEmCMilhar == 0 && restoEmDMilhar == 0 && restoEmUMilhar == 0){
				return String.format("%s milhoes e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));

			}
			if(restoEmCMilhar == 0 && restoEmDMilhar == 0 ){ 
				return String.format("%s milhoes e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));

			}
			if(restoEmCMilhar == 0){ 
				return String.format("%s milhoes e %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));

			}
			return String.format("%s milhoes %s", retornaExtenso(num2), retornaExtenso(restoEmCMilhar));
		}		

		
	}
		
	
	
	public static void main(String[] args) {
		NumPorExtenso extenso = new NumPorExtenso();
		String numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Para sair digite: -1");
		System.out.println("Digite o numero que o queira ter por extenso entre 0 e 1000000000");
		
		numero = sc.nextLine();

		while(Integer.parseInt(numero) != -1){
			
			try{
				System.out.println("Seu numero eh: " + extenso.retornaExtenso(Integer.parseInt(numero)));
			}
			catch (NumberFormatException nfe) {
				System.out.println("Digite o numero que o queira ter por extenso entre 0 e 1000000000");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			numero = sc.nextLine();
		}	
		
	}
}
