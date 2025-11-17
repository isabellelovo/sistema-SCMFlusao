package model;

// Definir atr. de relacionamento

public class Produto {
    private int id;
    private String nome;
    private String situacao;
    private double preco;

    private static Produto[] arrayProdutos = new Produto[5];
	private static int numElementos = 0;

    public Produto(int id, String nome, double preco) {
        this.setId(id);
        this.setNome(nome);
        this.setSituacao("Análise");
        this.setPreco(preco);
        Produto.guardarProduto(this);
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return this.id;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return this.nome;
    }

    private void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    private String getSituacao() {
        return this.situacao;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private double getPreco() {
        return this.preco;
    }

    public static void guardarProduto(Produto prodNovo) {
		Produto.arrayProdutos[Produto.numElementos] = prodNovo;
		Produto.numElementos++;
	}

	public static Produto selecionarProduto(int escolha) {
		return Produto.arrayProdutos[escolha-1];
	}

    public void reprovar() {
        this.setSituacao("Reprovado");
    }

    public void aprovar() {
        this.setSituacao("Disponível");
    }

    public void vender() {
        this.setSituacao("Vendido");
    }
}