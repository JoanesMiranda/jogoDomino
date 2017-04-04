package br.com.domino.model;

public class Pecas {

	private Integer ladoEsquerdo;
	private Integer ladoDireito;
	private Integer pecaAssociada;
	private int estadoDoJogo;

	public Pecas() {

	}

	public Pecas(Integer ladoEsquerdo, Integer ladoDireito) {
		
		this.ladoEsquerdo = ladoEsquerdo;
		this.ladoDireito = ladoDireito;
	}
	
	public Integer getLadoEsquerdo() {
		return ladoEsquerdo;
	}

	public void setLadoEsquerdo(Integer ladoEsquerdo) {
		this.ladoEsquerdo = ladoEsquerdo;
	}
	
	public Integer getLadoDireito() {
		return ladoDireito;
	}

	public void setLadoDireito(Integer ladoDireito) {
		this.ladoDireito = ladoDireito;
	}
	
	public Integer getPecaAssociada() {
		return pecaAssociada;
	}

	public void setPecaAssociada(Integer pecaAssociada) {
		this.pecaAssociada = pecaAssociada;
	}

	public int getEstadoDoJogo() {
		return estadoDoJogo;
	}

	public void setEstadoDoJogo(int estadoDoJogo) {
		this.estadoDoJogo = estadoDoJogo;
	}

}
