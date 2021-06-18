package br.com.fiap.cartaocredito.test;

import br.com.fiap.cartaocredito.model.CartaoCreditoBlack;

public class CartaoCreditoHerancaTest {

	public static void main(String[] args) {
		
		CartaoCreditoBlack cartaoCreditoBlack = new CartaoCreditoBlack();
		cartaoCreditoBlack.setNumeroCartao("123");
		cartaoCreditoBlack.setCvv(999);
		cartaoCreditoBlack.setSalaVip("Congonhas");
		
		System.out.println(cartaoCreditoBlack);		
	}

}