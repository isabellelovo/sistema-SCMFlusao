package model;

import java.util.Date;
import model.Armazem;
import model.Produto;

public class TransporteProduto {

    // ATRIBUTOS

    private String id;
    private String situacao;
    private Date dtSaida;
    private Date dtChegada;
    private double frete;
    private Produto produto;
    private Armazem armazemOrigem;
    private Armazem armazemDestino;

    // MÉTODOS PADRÃO

    public TransporteProduto(String id, Date dtSaida, Date dtChegada, double frete, Produto produto, Armazem armazemOrigem, Armazem armazemDestino) {
        this.setId(id);
        this.situacao = "Ativo";
        this.setDtSaida(dtSaida);
        this.setDtChegada(dtChegada);
        this.setFrete(frete);
        this.setProduto(produto);
        this.setArmazemOrigem(armazemOrigem);
        this.setArmazemDestino(armazemDestino);
    }

    // public TransporteProduto(?) { }

	public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtSaida() {
        return this.dtSaida;
    }

    public void setDtChegada(Date dtChegada) {
        this.dtChegada = dtChegada;
    }

    public Date getDtChegada() {
        return this.dtChegada;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getFrete() {
        return this.frete;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public Armazem getArmazemOrigem() {
		return armazemOrigem;
	}

	public void setArmazemOrigem(Armazem armazemOrigem) {
		this.armazemOrigem = armazemOrigem;
	}

	public Armazem getArmazemDestino() {
		return armazemDestino;
	}

	public void setArmazemDestino(Armazem armazemDestino) {
		this.armazemDestino = armazemDestino;
	}

    // MÉTODOS DOS DIAGRAMAS (D.E e D.S)

	public void embarcar() {
        this.situacao = "Embarcado";
    }

    public void movimentar() {
        this.situacao = "Em trânsito";
    }

    public void interromper() {
        this.situacao = "Suspenso";
    }

    public void retornarTransito() {
        this.movimentar();
    }

    public void chegarDestino() {
        this.situacao = "Finalizado";
    }


    /* MÉTODOS DE VALIDAÇÃO

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

    */

}