package model;

public class ItemProduto {
	private int id;
	private String nome;
	private String situacao;
	private double preco;

	private static ItemProduto[] arrayItens = new ItemProduto[5];
	private static int numElementos = 0;
	
	public ItemProduto(int id, String nome, String situacao, double preco){
		this.setId(id);
		this.setNome(nome);
		this.setSituacao(situacao);
		this.setPreco(preco);
		ItemProduto.guardarItem(this);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static void guardarItem(ItemProduto itemNovo) {
		ItemProduto.arrayItens[ItemProduto.numElementos] = itemNovo;
		ItemProduto.numElementos++;
	}

	public static ItemProduto selecionarItem(int escolha) {
		return ItemProduto.arrayItens[escolha-1];
	}
}
