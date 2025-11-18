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

    public void setEmpresa(EmpresaParceira empresa) {
        this.empresa = empresa;
    }

    public EmpresaParceira getEmpresa() {
        return this.empresa;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
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
