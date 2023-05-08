package projeto_nauman;

public class DataTeste {
	
	public static void main(String[] args) {

		System.out.println(manipulaData(10102022));

	}
	private static String manipulaData(int pData) {
		String data_retorno = "";
		String number = String.valueOf(pData);
		int contador = 0;
		
        char[] digits1 = number.toCharArray();

        for(int i = 0; i < digits1.length; i++) {
        	contador ++;
        	data_retorno += digits1[i];
        	if(contador == 2 || contador == 4) {
        		data_retorno += "/";
        	}
        }
		
		return data_retorno;	
	}
	
}
