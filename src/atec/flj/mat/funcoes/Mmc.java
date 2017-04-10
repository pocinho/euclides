/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec.flj.mat.funcoes;

import atec.flj.mat.NumeroInt;

public class Mmc {	
	public static NumeroInt calcula(NumeroInt n1, NumeroInt n2) {

		int a = n1.getNumero();
		int b = n2.getNumero();

		int r = (a * b)/Mdc.calcula(n1, n2).getNumero();

		return new NumeroInt(r);
	}
}
