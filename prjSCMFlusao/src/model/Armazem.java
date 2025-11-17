package model;

public class Armazem {
    private int id;
    private String cep;
    private String logradouro;
    private int numero;
	private Cidade cidade;
    private String telefone;

	private static Armazem[] arrayArmazens = new Armazem[5];
	private static int numElementos = 0;
    
	public Armazem(int id, String cep, String logradouro, int numero, Cidade cidade, String telefone){
		this.setId(id);
		this.setCep(cep);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
		this.setTelefone(telefone);
		Armazem.guardarArmazem(this);
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cidade getCidade() {
		return this.cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static void guardarArmazem(Armazem armazemNovo) {
		Armazem.arrayArmazens[Armazem.numElementos] = armazemNovo;
		Armazem.numElementos++;
	}

	public static Armazem selecionarArmazem(int escolha) {
		return Armazem.arrayArmazens[escolha-1];
	}
}
