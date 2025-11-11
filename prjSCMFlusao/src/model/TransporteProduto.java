package model;

import java.util.Date;

public class TransporteProduto {

    // ATRIBUTOS

    private String id;
    private String situacao;
    private Date dtSaida;
    private Date dtChegada;
    private double frete;

    // MÉTODOS PADRÃO

    public TransporteProduto(String id, String situacao, Date dtSaida, Date dtChegada, double frete) {
        this.setId(id);
        this.setSituacao(situacao);
        this.setDtSaida(dtSaida);
        this.setDtChegada(dtChegada);
        this.setFrete(frete);
    }

    // public TransporteProduto(?) { }

    private void setId(String id) {
        this.validarId(id);
        this.id = id;
    }

    private String getId() {
        return this.id;
    }

    private void setSituacao(String situacao) {
        this.validarSituacao(situacao);
        this.situacao = situacao;
    }

    private String getSituacao() {
        return this.situacao;
    }

    private void setDtSaida(Date dtSaida) {
        this.validarDtSaida(dtSaida);
        this.dtSaida = dtSaida;
    }

    private Date getDtSaida() {
        return this.dtSaida;
    }

    private void setDtChegada(Date dtChegada) {
        this.validarDtChegada(dtChegada);
        this.dtChegada = dtChegada;
    }

    private Date getDtChegada() {
        return this.dtChegada;
    }

    private void setFrete(double frete) {
        this.validarFrete(frete);
        this.frete = frete;
    }

    private double getFrete() {
        return this.frete;
    }

    // MÉTODOS DOS DIAGRAMAS (D.E e D.S)


    // MÉTODOS DE VALIDAÇÃO

    private void validarId(String id) {

    }

    private void validarSituacao(String situacao) {

    }

    private void validarDtSaida(Date dtSaida) {

    }

    private void validarDtChegada(Date dtChegada) {

    }

    private void validarFrete(double frete) {

    }

}