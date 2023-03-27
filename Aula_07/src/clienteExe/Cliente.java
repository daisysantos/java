package clienteExe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	
	private String nomeCompleto;
	private int idade;
	private String CPF;
	private LocalDate dataNascimento;
	private double altura;
	
	
	public Cliente(String nomeCompleto, int idade, String cPF, LocalDate dataNascimento, double altura) {
		
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void visualizar() {
		
		
	System.out.println("******************************************");
	System.out.println("             Dados do cliente			  ");
	System.out.println("******************************************");
	System.out.println("* Paciente:           " + this.nomeCompleto);
	System.out.println("* Idade: " + this.idade + "anos"           );
	System.out.println("* CPF -           " + this.CPF              );
	System.out.println("* Data de nascimento:" + this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
	
	System.out.println("* Altura:             " + this.altura       );
	

	}
}


