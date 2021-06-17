package br.com.fiap.cartaocredito.test;

import javax.swing.JOptionPane;

import br.com.fiap.cartaocredito.action.PagarFatura;
import br.com.fiap.cartaocredito.model.CartaoCredito;
import br.com.fiap.cartaocredito.model.Portador;

public class PagamentoFaturaTest {

	public static void main(String[] args) {
		
		CartaoCredito cartaoCredito = new CartaoCredito();
		//cartaoCredito.setNumeroCartao( JOptionPane.showInputDialog("Digite o cartão") );
		cartaoCredito.setNumeroCartao( "0000 0000 0000 9999" );
		cartaoCredito.setBandeira("Master");
		//cartaoCredito.setCvv( Integer.parseInt(JOptionPane.showInputDialog("Digite o CVV")) );
		cartaoCredito.setValorSaldo(2000.00);
		cartaoCredito.setSegmento("Black");
		cartaoCredito.setEmissor("Pagseguro");
		
		Portador portador = new Portador();
		portador.setCpfPortador("191");
		portador.setNomePortador("Flávio Moreni");
		portador.setValorLimite(10000.00);
		
		Portador titular = new Portador();
		titular.setCpfPortador("991");
		titular.setNomePortador("Elias de Souza");
		titular.setValorLimite(100000.00);
		
		cartaoCredito.setPortador(portador);
		cartaoCredito.setTitular(titular);
		
		
		// Operação para pagar a fatura
		PagarFatura pagarFatura = new PagarFatura();
		pagarFatura.efetuarPagamento(cartaoCredito, 199.00);
		
	}

}
