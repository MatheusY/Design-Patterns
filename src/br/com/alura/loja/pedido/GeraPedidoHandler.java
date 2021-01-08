package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGeraPedido;

public class GeraPedidoHandler {

	List<AcaoAposGeraPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGeraPedido> acoes) {
		this.acoes = acoes;
	}
	// Injeção de dependencias

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
