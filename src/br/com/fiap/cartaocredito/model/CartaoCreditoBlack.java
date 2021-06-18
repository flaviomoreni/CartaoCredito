package br.com.fiap.cartaocredito.model;

import java.util.Arrays;

public class CartaoCreditoBlack extends CartaoCredito {
	
	
	public CartaoCreditoBlack() {
	}
	
	public CartaoCreditoBlack(String numeroCartao) {
		setNumeroCartao(numeroCartao);
	}
	
	private String salaVip;

	public String getSalaVip() {
		return salaVip;
	}

	public void setSalaVip(String salaVip) {
		this.salaVip = salaVip;
	}

	
	@Override
	public String toString() {
		return "CartaoCreditoBlack [salaVip=" + salaVip + ", getCartaoCreditoId()=" + getCartaoCreditoId()
				+ ", getNumeroCartao()=" + getNumeroCartao() + ", getBandeira()=" + getBandeira() + ", getPortador()="
				+ getPortador() + ", getTitular()=" + getTitular() + ", getValidade()=" + getValidade() + ", getCvv()="
				+ getCvv() + ", getEmissor()=" + getEmissor() + ", getDiaVencimentoFatura()=" + getDiaVencimentoFatura()
				+ ", getValorLimite()=" + getValorLimite() + ", getValorSaldo()=" + getValorSaldo() + ", getSegmento()="
				+ getSegmento() + ", getValorAnuidade()=" + getValorAnuidade() + ", getTecnologia()="
				+ Arrays.toString(getTecnologia()) + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
