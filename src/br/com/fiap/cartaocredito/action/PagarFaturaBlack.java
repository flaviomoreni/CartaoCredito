package br.com.fiap.cartaocredito.action;

import br.com.fiap.cartaocredito.model.CartaoCreditoBlack;

public class PagarFaturaBlack extends PagarFatura {


	// modificadorAcesso tipoDoRetorno nomeAcao ( parametros )  
	public boolean liberarSalaVip(CartaoCreditoBlack cartaoCreditoBlack) {
		
		// Conectar no banco de dados
		
		// Pesquisar o cartão
		
		// Verificar se fatura está paga
		
		// Atualizar a informação de liberação da sala Vip
		
		// ETC
		
		System.out.println("**************************************");
		System.out.println(" Sala Vip liberado com sucesso para o Cartão: " + 
					cartaoCreditoBlack.getNumeroCartao());
		System.out.println("**************************************");
		
		return true;
	}

	
	// reserva de local
	
	// escolha de menu
	
	// escolher brindes
	
	// pedir cor do envolope selecionado pelo cliente
	
	// solicitar Concierge
	
	
	
}
