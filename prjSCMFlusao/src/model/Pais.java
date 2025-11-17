package model;

public class Pais {
	private int ddi;
	private String nome;
	private String continente;

	public Pais(int ddi, String nome, String continente) {
		this.setDdi(ddi);
		this.setNome(nome);
		this.setContinente(continente);
	}
	
	public int getDdi() {
		return this.ddi;
	}
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContinente() {
		return this.continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
}
