package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDesconto = new DescontoParaPagamentosComMaisDeCincoItens(
				new DescontoParaPagamentosComValorMaiorDoQueQuinhentos(
						new SemDesconto()));
		
		return cadeiaDesconto.calcular(orcamento);
	}
}
