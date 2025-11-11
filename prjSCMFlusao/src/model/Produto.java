package model;

public class Produto {

    // ATRIBUTOS

    private String id;
    private String nome;
    private String situacao;
    private double preco;

    // MÉTODOS PADRÃO

    public Produto(String id, String nome, String situacao, double preco) {
        this.setId(id);
        this.setNome(nome);
        this.setSituacao(situacao);
        this.setPreco(preco);
    }
    
    // public Produto(?) { }

    private void setId(String id) {
        this.validarId(id);
        this.id = id;
    }

    private String getId() {
        return this.id;
    }

    private void setNome(String nome) {
        this.validarNome(nome);
        this.nome = nome;
    }

    private String getNome() {
        return this.nome;
    }

    private void setSituacao(String situacao) {
        this.validarSituacao(situacao);
        this.situacao = situacao;
    }

    private String getSituacao() {
        return this.situacao;
    }

    private void setPreco(double preco) {
        this.validarPreco(preco);
        this.preco = preco;
    }

    private double getPreco() {
        return this.preco;
    }

    // MÉTODOS DOS DIAGRAMAS (D.E e D.S)


    // MÉTODOS DE VALIDAÇÃO

    private void validarId(String id) {

    }

    private void validarNome(String nome) {

    }

    private void validarSituacao(String situacao) {

    }

    private void validarPreco(double preco) {

    }

}
