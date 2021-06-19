package br.com.fiap.cartaocredito.action;

import br.com.fiap.cartaocredito.model.CartaoCreditoInfinite;

public class PagarFaturaInfinite extends PagarFatura {

	public void renovarSeguro(CartaoCreditoInfinite cartaoCreditoInfinite) {
		System.out.println("Seguro renovado com sucesso: " + cartaoCreditoInfinite.getNumeroCartao());
	}
	
}
