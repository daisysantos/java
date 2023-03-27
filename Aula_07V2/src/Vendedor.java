
public class Vendedor extends Funcionario {
	
	private String tipo;
	
	public Vendedor(String nome, String cargo, String matricula, float salario, int idade, String tipo) {
		super(nome, cargo, matricula, salario, idade);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {
		super.visualizar();
		
		System.out.println("Tipo de vendedor: " + this.tipo);

}}
