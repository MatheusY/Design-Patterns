package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGeraPedido;

public class GeraPedidoHandler {
	
	List<AcaoAposGeraPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGeraPedido> acoes) {
		this.acoes = acoes;
	}
	//Injeção de dependencias
	
	public void execute(GeraPedido dados) {
	Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
