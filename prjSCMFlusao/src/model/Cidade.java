package model;

public class Cidade {
	private int ddd;
	private String nome;
	private String estado;
	private Pais pais;

	private static Cidade[] arrayCidades = new Cidade[2];
	private static int numElementos = 0;

	public Cidade(int ddd, String nome, String estado, Pais pais){
		this.setDdd(ddd);
		this.setNome(nome);
		this.setEstado(estado);
		this.setPais(pais);
		Cidade.guardarCidade(this);
	}

	public int getDdd() {
		return this.ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static void guardarCidade(Cidade cidadeNova) {
		Cidade.arrayCidades[Cidade.numElementos] = cidadeNova;
		Cidade.numElementos++;
	}

	public static Cidade selecionarCidade(int escolha){
		return Cidade.arrayCidades[escolha-1];
	}
}
