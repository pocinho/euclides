/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec.flj;

import atec.flj.mat.Fracao;
import atec.flj.mat.NumeroInt;

public class TesteMat {

	public static void main(String[] args) {
		NumeroInt a = new NumeroInt(13);
		NumeroInt b = new NumeroInt(6);
		
		Fracao f = new Fracao(a, b);
		
		System.out.println(f.Soma(new Fracao(new NumeroInt(10), new NumeroInt(8))));

	}

}
