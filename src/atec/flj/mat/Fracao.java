/**
 * Autor: Paulo Pocinho
 * Desde: 10-04-2017
 */
package atec.flj.mat;

import atec.flj.mat.funcoes.Mdc;
import atec.flj.mat.funcoes.Mmc;

public class Fracao {
	private NumeroInt numerador;
	private NumeroInt denominador;
	
	public NumeroInt getNumerador() {
		return numerador;
	}

	public void setNumerador(NumeroInt numerador) {
		this.numerador = numerador;
	}

	public NumeroInt getDenominador() {
		return denominador;
	}

	public void setDenominador(NumeroInt denominador) {
		this.denominador = denominador;
	}

	public Fracao(NumeroInt numerador, NumeroInt denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fracao Soma(Fracao fracaoAsomar) {
		int n1 = numerador.getNumero();
		int d1 = denominador.getNumero();
		int n2 = fracaoAsomar.getNumerador().getNumero();
		int d2 = fracaoAsomar.getDenominador().getNumero();
		int novoNumerador = 0;
		int novoDenominador = 0;
		int mdc = 0;

		novoDenominador = Mmc.calcula(this.denominador, fracaoAsomar.getDenominador()).getNumero();
		n1 *= novoDenominador / d1;
		n2 *= novoDenominador / d2;
		novoNumerador = n1 + n2;

		mdc = Mdc.calcula(new NumeroInt(novoNumerador), new NumeroInt(novoDenominador)).getNumero();
		novoNumerador /= mdc;
		novoDenominador /= mdc;

		setNumerador(new NumeroInt(novoNumerador));
		setDenominador(new NumeroInt(novoDenominador));

		return this;
	}

	@Override
	public String toString() {
		String resultado = "";
		if (this.denominador.getNumero() == 1) {
			resultado += numerador;
		} else {
			resultado = numerador + "/" + denominador;
		}
		return resultado;
	}

}
