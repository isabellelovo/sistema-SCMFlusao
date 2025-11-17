package model;

public class EmpresaParceira {
    private String cnpj;
    private String razaoSocial;

	private static EmpresaParceira[] arrayEmpresas = new EmpresaParceira[5];
	private static int numElementos = 0;
    
	public EmpresaParceira (String cnpj, String razaoSocial){
		this.setCnpj(cnpj);
		this.setRazaoSocial(razaoSocial);
		EmpresaParceira.guardarEmpresa(this);
	}
    
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public static void guardarEmpresa(EmpresaParceira EmpresaNova) {
		EmpresaParceira.arrayEmpresas[EmpresaParceira.numElementos] = EmpresaNova;
		EmpresaParceira.numElementos++;
	}

	public static EmpresaParceira selecionarEmpresa(int escolha) {
		return EmpresaParceira.arrayEmpresas[escolha-1];
	}
}
