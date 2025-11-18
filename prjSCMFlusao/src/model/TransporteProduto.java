package model;

import java.util.Date;

public class TransporteProduto {
    private int id;
    private String situacao;
    private Date dtSaida;
    private Date dtChegada;
    private double frete;
    private Agente agente;
    private Armazem armazemOrigem;
    private Armazem armazemDestino;
    private Produto produto;

    public TransporteProduto(int id, Date dtSaida, Date dtChegada, double frete, Agente agente, Armazem armazemOrigem, Armazem armazemDestino, Produto produto) {
        this.setId(id);
        this.setSituacao("Ativo");
        this.setDtSaida(dtSaida);
        this.setDtChegada(dtChegada);
        this.setFrete(frete);
        this.setAgente(agente);
        this.setArmazemOrigem(armazemOrigem);
        this.setArmazemDestino(armazemDestino);
        this.setProduto(produto);
    }

	public void setId(int id) {
        this.id = id;
    }

    public int getId() {
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

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Agente getAgente() {
        return this.agente;
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

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

	public void embarcar() {
        this.setSituacao("Embarcado");
    }

    public void movimentar() {
        this.setSituacao("Em trânsito");
    }

    public void interromperTransito() {
        this.setSituacao("Suspenso");
    }

    public void retornarTransito() {
        this.movimentar();
    }

    public void chegarDestino() {
        this.setSituacao("Recebido");
    }

    public void finalizar() {
        this.setSituacao("Finalizado");
        this.agente.finalizarDemanda();
    }

}