public class TestarFuncionario {

	public static void main(String[] args) {

		
		
		Funcionario f1 = new Funcionario("Daisy Santos", "CEO", "1234", 5.000f, 25);
		f1.visualizar();
		
		Funcionario f2 = new Funcionario("Carolina Araujo", "Gerente", "1234", 4.000f, 26);
		f2.visualizar();
		
		Gerente g2 = new Gerente ("Carolina Araujo" , "Gerente" , "1234" , 4.000f , 26, "Integral" , 3);
		g2.visualizar();
		
		Vendedor v1 = new Vendedor ("Gabriel Machado", "Vendedor", "12345", 2.000f, 19, "Interno");
		v1.visualizar();
			
		
	}

}
