package br.com.fiap.loja;


// TODO: Auto-generated Javadoc
/**
 * MoedaEstrangeira. Classe responsável pelo tratamento da moeda americana
 */
public class MoedaEstrangeira {

	/**
	 * Converter valor monetário de dolar para real.
	 *
	 * @param valor valor em dolar
	 * @return valor em reais
	 * @author Silvano Moreira
	 */
	public int converterDolar(int valor){
		if (valor < 0) return 0;
		
		return valor * 2;
	}

}
