package br.com.fiap.cartaocredito.test;

import br.com.fiap.cartaocredito.action.PagarFatura;
import br.com.fiap.cartaocredito.action.PagarFaturaInfinite;
import br.com.fiap.cartaocredito.model.CartaoCreditoInfinite;
import br.com.fiap.cartaocredito.model.Portador;

public class PagarFaturaInfiniteTest {

	public static void main(String[] args) {

		CartaoCreditoInfinite cartaoCredito = new CartaoCreditoInfinite();
		cartaoCredito.setNumeroCartao( "0000 0000 0000 9999" );
		cartaoCredito.setValorSaldo(2000.00);
		
		Portador portador = new Portador();
		portador.setCpfPortador("191");
		portador.setNomePortador("Flávio Moreni");
		portador.setValorLimite(10000.00);
		
		cartaoCredito.setPortador(portador);
		
		
		PagarFaturaInfinite pagarFatura = new PagarFaturaInfinite();
		pagarFatura.efetuarPagamento(cartaoCredito, 2000);
		pagarFatura.renovarSeguro(cartaoCredito);
		
		
	}

}
