
public class Transformador {
	private static int milhao = 1000000;
    private static int mil = 1000;
    private static int bilhao = 1000000000;
    private static String[] entre0e19 = { "zero", "um", "dois", "tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze",
                    "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete","dezoito", "dezenove" };
    private static String[] dezena = { "vinte", "trinta", "quarenta","ciquenta", "sessenta", "setenta", "oitenta", "noventa" };
    private static String[] centena = { "cem", "duzentos", "trezentos","quatrocentos", "quinhentos", "seiscentos", "setecentos",
                    "oitocentos", "novecentos" };

    /**
     * Retorna o valor em sua vers‹o escrita
     * 
     * @param valor
     *            valor a ser transformado
     * @return vers‹o escrita
     */
    public String getValue(int valor) {
            if (valor == bilhao) {
                    return "um bilh‹o";
            }
            // [0..99]
            if (valor < 100) {
                    return getMenoresDe99(valor);
            }
            // centena
            else if (valor >= 100 && valor < 1000) {
                    return getCentena(valor);
            } else if(valor < 1000000){
                    return getMilhar(valor);
            } else {
                    return getMilhao(valor);
            }
    }

    /**
     * Transforma os nœmeros unit‡rios e decimais em sua vers‹o em portugus
     * 
     * @param valor
     * @return vers‹o escrita
     */
    public String getMenoresDe99(int valor) {
            char[] charArray = converteInteiro(valor);
            if (valor < 20) {
                    return entre0e19[valor];
            } else {
                    if (Integer.valueOf(String.valueOf(charArray[1])) == 0) {
                            return dezena[Integer.valueOf(String.valueOf(charArray[0])) - 2];
                    }
                    return dezena[Integer.valueOf(String.valueOf(charArray[0])) - 2]
                                    + " e "
                                    + entre0e19[(Integer.valueOf(String.valueOf(charArray[1])))];
            }
    }

    /**
     * Transforma os nœmeros da centesimais para sua portugus
     * 
     * @param i
     *            valor a ser tranformado
     * @return vers‹o escrita
     */
    public String getCentena(int valor) {
            String resposta = "";
            // casa da centena
            if (valor > 100 && valor < 200) {
                    resposta = "cento";
            } else {
                    resposta = centena[valor / 100 - 1];
            }

            valor = valor % 100;
            // casa da dezena e unidade
            if (valor != 0) {
                    resposta += " e " + getMenoresDe99(valor);
            } else {
                    resposta += "";
            }
            return resposta;
    }

    /**
     * Transforma os nœmeros dos milhares para sua portugus
     * 
     * @param valor
     *            valor a ser tranformado
     * @return vers‹o escrita
     */
    public String getMilhar(int valor) {
            int parteMilhar = valor / mil;
            if (valor == mil) {
                    return "mil";
            }
            if (valor % 1000 != 0) {
                            if (parteMilhar == 0) {
                                    return "e " + getValue(valor % 1000);
                            }
                            else if(parteMilhar == 1) {
                                    return "mil " + "e "+ getValue(valor % 1000);
                            }
                            return getValue(parteMilhar)+ " mil " + "e "+ getValue(valor % 1000);
                    }
            return getValue(parteMilhar) + " mil";
    }

    /**
     * Transforma os nœmeros dos milh›es para sua portugus
     * 
     * @param i
     *            valor a ser tranformado
     * @return vers‹o escrita
     */
    public String getMilhao(int i) {
            int parteMilhao = i / milhao;
            if(i == milhao) {
                    return "um milh‹o";
            }
            if (parteMilhao == 1) {
                    return getValue(parteMilhao) + " milh‹o " + getMilhar(i % milhao);
            }
            return getValue(parteMilhao) + " milh›es " + getMilhar(i % milhao);
    }

    /**
     * Converte o inteiro para um arry de char
     * 
     * @param inteiro
     *            a ser convertido
     * @return o array de chars
     */
    private char[] converteInteiro(int i) {
            String elem = String.valueOf(i);
            char[] charArray = elem.toCharArray();
            return charArray;

    }
}
