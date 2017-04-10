/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec.flj.mat;

public class NumeroInt {

	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public NumeroInt(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "" + numero;
	}
}
