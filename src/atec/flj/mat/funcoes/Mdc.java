/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec.flj.mat.funcoes;

import atec.flj.mat.NumeroInt;

public class Mdc {
	
	public static NumeroInt calcula(NumeroInt n1, NumeroInt n2) {
		NumeroInt resultado = null;
		
		int a = n1.getNumero();
		int b = n2.getNumero();
		int aux = 0;
		
		if (a > b) {
			for (;;) {
				if (a % b == 0) {
					resultado = new NumeroInt(b);
					break;
				} else {
					aux = a;
					a = b;
					b = aux % a;
				}
			}
		} else {
			for (;;) {
				if (b % a == 0) {
					resultado = new NumeroInt(a);
					break;
				} else {
					aux = b;
					b = a;
					a = aux % b;
				}
			}
		}
		
		return resultado;
	}

}
