/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec;

import atec.flj.mat.Fracao;
import atec.flj.mat.NumeroInt;

public class TestePackage {

	public static void main(String[] args) {
		NumeroInt a = new NumeroInt(1);
		NumeroInt b = new NumeroInt(3);
		
		Fracao f = new Fracao(a, b);
		
		System.out.println(f.Soma(new Fracao(new NumeroInt(2), new NumeroInt(5))));

	}
}
