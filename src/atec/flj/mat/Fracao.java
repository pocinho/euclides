/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec.flj.mat;

import atec.flj.mat.funcoes.Mmc;

public class Fracao {
	private NumeroInt numerador;
	private NumeroInt denominador;
	
	public NumeroInt getNumerador() {
		return numerador;
	}

	public NumeroInt getDenominador() {
		return denominador;
	}

	public Fracao(NumeroInt numerador, NumeroInt denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fracao Soma(Fracao f) {
		Fracao resultado = null;
		
		int n1 = numerador.getNumero();
		int d1 = denominador.getNumero();
		int n2 = f.getNumerador().getNumero();
		int d2 = f.getDenominador().getNumero();
		
		if (d1 != d2) {
			int mmc = Mmc.calcula(denominador, f.getDenominador()).getNumero();			
			n1 *= d2;
			n2 *= d1;
			resultado = new Fracao(new NumeroInt(n1+n2), new NumeroInt(mmc));
		} else {
			resultado = new Fracao(new NumeroInt(n1+n2), new NumeroInt(d1));
		}
		
		return resultado;
	}
	
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}

}
