package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("40")));
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("40")));
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("40")));
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("40")));
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("40")));
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}
	
	

}
