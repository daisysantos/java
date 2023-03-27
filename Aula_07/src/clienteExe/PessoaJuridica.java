package clienteExe;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
	
	private String tipoLegal;
	private String porte;
	
	public PessoaJuridica(String nomeCompleto, int idade, String cPF, LocalDate dataNascimento, double altura, String TipoLegal, String porte) {
		super(nomeCompleto, idade, cPF, dataNascimento, altura);
		this.tipoLegal = tipoLegal;
		this.porte = porte;
	}

	public String getTipoLegal() {
		return tipoLegal;
	}

	public void setTipoLegal(String tipoLegal) {
		this.tipoLegal = tipoLegal;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public void visualizar() {
		super.visualizar();
		
		System.out.println("Tipo Legal: " + this.tipoLegal);	
		System.out.println("Tamanho da empresa: " + this.porte);	
	

	
}
}
