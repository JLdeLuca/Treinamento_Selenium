package br.com.luca.entidade;

import java.util.Date;

public class NotaAluguel {
	
	private int preco;
	private Date dataEntrega;
	private int pontuacao;
	
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		// TODO Auto-generated method stub
		return dataEntrega;
	}

	public void setDataEntrega(Date time) {
		// TODO Auto-generated method stub
		dataEntrega = time;
		
	}

	public int getPontuacao() {
		// TODO Auto-generated method stub
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
