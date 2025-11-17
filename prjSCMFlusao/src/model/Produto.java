package model;

public class Produto {

    // ATRIBUTOS

    private int id;
    private String nome;
    private String situacao;
    private double preco;

    // MÉTODOS PADRÃO

    public Produto(int id, String nome, double preco) {
        this.setId(id);
        this.setNome(nome);
        this.situacao = "Análise";
        this.setPreco(preco);
    }
    
    // M. CONSTRUTOR SOBRECARGA: public Produto(?) { }

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

    // MÉTODOS DOS DIAGRAMAS (D.E e D.S)

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