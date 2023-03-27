
public class Funcionario {
	
	private String nome;
	private String cargo;
	private String matricula;
	private float salario;
	private int idade;
	
	public Funcionario(String nome, String cargo, String matricula, float salario, int idade) {
		
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
		this.salario = salario;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;} 

		public void visualizar() {
			
			System.out.println("******************************************");
			System.out.println("             Funcionario				  ");
			System.out.println("******************************************");
			System.out.println("\nNome:                       " + this.nome);
			System.out.println("\nCargo:                      "+ this.cargo);
			System.out.println("\nMatricula:             " + this.matricula);
			System.out.println("\nSalário :                " + this.salario);
			System.out.println("\nIdade :                    " + this.idade);
			
			
	
	}
}
	
	
	
	
	