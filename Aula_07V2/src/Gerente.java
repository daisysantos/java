
public class Gerente  extends Funcionario {
	
	private String periodo;
	private int folga;

	public Gerente(String nome, String cargo, String matricula, float salario, int idade, String periodo, int folga) {
		super(nome, cargo, matricula, salario, idade);
		this.periodo = periodo;
		this.folga = folga;
		
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getFolga() {
		return folga;
	}

	public void setFolga(int folga) {
		this.folga = folga;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("Período: " + this.periodo);
		System.out.println("Folgas por semana: " + this.getFolga());
		System.out.println("******************************************");
}
}
	
	
