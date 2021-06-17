package br.com.fiap.cartaocredito.businessrules;

import br.com.fiap.cartaocredito.model.CartaoCredito;


public class PagamentoFaturaRegras {
	
	public boolean validarPagamento (CartaoCredito cartaCredito, double valorPagamento) {
		
		boolean ehValido = true;

		// verificar o valor do pagamento > que o saldo
				
		if (valorPagamento >  cartaCredito.getValorSaldo() ) {
			ehValido = false;
		}

		// verificar o valor do pagamento < 10% do saldo
		// pagamento minimo
		if ( valorPagamento < (cartaCredito.getValorSaldo() * 0.1) ) {
			ehValido = false;
		}
		
		
		return ehValido;
		
	}
	
	

}
