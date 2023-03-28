package clienteExe;

import java.time.LocalDate;

public class PessoaFisica extends Cliente{
	
	private String TipoLegal;
	
	public PessoaFisica(String nomeCompleto, int idade, String cPF, LocalDate dataNascimento, double altura, String TipoLegal) {
		super(nomeCompleto, idade, cPF, dataNascimento, altura);
		this.TipoLegal = TipoLegal;
		
	}

	public String getTipoLegal() {
		return TipoLegal;
	}

	public void setTipoLegal(String tipoLegal) {
		TipoLegal = tipoLegal;
	}

	@Override
	public void visualizar() {
		super.visualizar();
	
	System.out.println("Tamanho da empresa: " + this.TipoLegal);	
	System.out.println("*******************************************");

}
}