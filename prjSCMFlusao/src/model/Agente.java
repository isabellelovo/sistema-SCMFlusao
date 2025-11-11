package model;

public class Agente {

    // ATRIBUTOS

    private String id;
    private String nome;
    private EmpresaParceira empresaParceira;
    private String situacao;

    // MÉTODOS PADRÃO

    public Agente(String id, String nome, EmpresaParceira empresaParceira, String situacao) {
        this.setId(id);
        this.setNome(nome);
        this.setEmpresaParceira(empresaParceira);
        this.setSituacao(situacao);
    }

    // public Agente(?) { }

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

    private void setEmpresaParceira(EmpresaParceira empresaParceira) {
        this.validarEmpresaParceira(empresaParceira);
        this.empresaParceira = empresaParceira;
    }

    private EmpresaParceira getEmpresaParceira() {
        return this.empresaParceira;
    }

    private void setSituacao(String situacao) {
        this.validarSituacao(situacao);
        this.situacao = situacao;
    }

    private String getSituacao() {
        return this.situacao;
    }

    // MÉTODOS DOS DIAGRAMAS (D.E e D.S)


    // MÉTODOS DE VALIDAÇÃO

    private void validarId(String id) {

    }

    private void validarNome(String nome) {

    }

    private void validarEmpresaParceira(EmpresaParceira empresaParceira) {

    }

    private void validarSituacao(String situacao) {

    }

}
