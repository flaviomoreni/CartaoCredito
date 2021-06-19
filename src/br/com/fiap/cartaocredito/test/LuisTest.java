package br.com.fiap.cartaocredito.test;

import br.com.fiap.cartaocredito.model.CartaoCredito;
import br.com.fiap.cartaocredito.model.CartaoCreditoBlack;

public class LuisTest {

	public static void main(String[] args) {
		
		// Acabei de carimbar
		CartaoCreditoBlack cartao1 = new CartaoCreditoBlack();
		// Preenchendo os dados do espaço do carimbo
		cartao1.setNumeroCartao("0000 0000 0000 1111");
		cartao1.setCvv(991);
		
		CartaoCreditoBlack cartao2 = new CartaoCreditoBlack();
		cartao2.setNumeroCartao("0000 0000 0000 2222");
		cartao2.setCvv(992);
		

	}

}
