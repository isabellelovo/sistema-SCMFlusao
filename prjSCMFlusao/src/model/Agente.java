package model;

public class Agente {
    private int id;
    private String nome;
    private EmpresaParceira empresa;
    private String situacao;

    private static Agente[] arrayAgentes = new Agente[5];
	private static int numElementos = 0;

    public Agente(int id, String nome, EmpresaParceira empresa) {
        this.setId(id);
        this.setNome(nome);
        this.setEmpresa(empresa);
        this.setSituacao("Análise");
        this.guardarAgente(this);
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

    private void setEmpresa(EmpresaParceira empresa) {
        this.empresa = empresa;
    }

    private EmpresaParceira getEmpresa() {
        return this.empresa;
    }

    private void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    private String getSituacao() {
        return this.situacao;
    }

    public static void guardarAgente(Agente AgenteNovo) {
		Agente.arrayAgentes[Agente.numElementos] = AgenteNovo;
		Agente.numElementos++;
	}

	public static Agente selecionarAgente(int escolha) {
		return Agente.arrayAgentes[escolha-1];
	}

    public void reprovar() {
        this.setSituacao("Reprovado");
    }

    public void aprovar() {
        this.setSituacao("Disponível");
    }

    public void receberDemanda() {
        this.setSituacao("Responsável por Transporte");
    }

    public void finalizarDemanda() {
        this.setSituacao("Transporte Finalizado");
    }

    public void disponibilizar() {
        this.aprovar();
    }

}
