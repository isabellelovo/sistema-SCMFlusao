package model;

public class Produto {
    private int id;
    private String nome;
    private String situacao;
    private double preco;
    private ItemProduto[] arrayItens = new ItemProduto[5];

    private static Produto[] arrayProdutos = new Produto[5];
	private static int numElementos = 0;

    public Produto(int id, String nome, double preco, ItemProduto[] arrayItens) {
        this.setId(id);
        this.setNome(nome);
        this.setSituacao("Análise");
        this.setPreco(preco);
        this.setArrayItens(arrayItens);
        Produto.guardarProduto(this);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setArrayItens(ItemProduto[] arrayItens) {
        this.arrayItens = arrayItens;
    }

    public ItemProduto[] getArrayItens() {
        return this.arrayItens;
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