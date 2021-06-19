package br.com.fiap.cartaocredito.test;

import br.com.fiap.cartaocredito.model.Cliente;
import br.com.fiap.cartaocredito.model.GerenteRelaciomento;
import br.com.fiap.cartaocredito.model.Pessoa;
import br.com.fiap.cartaocredito.model.Portador;

public class PessoaHerancaTest {

	public static void main(String[] args) {

		GerenteRelaciomento gerenteRelaciomento = new GerenteRelaciomento();
		gerenteRelaciomento.setDocumentoIdentificacao("11111");
	
		Portador portador = new Portador();
		
		Cliente cliente = new Cliente();
		
		
		//Pessoa pessoa = new Pessoa();
		
	}

}
