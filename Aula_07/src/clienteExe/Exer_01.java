package clienteExe;

import java.time.LocalDate;

public class Exer_01 {

	public static void main(String[] args) {
		
		LocalDate data =  LocalDate.of(1990,05,29);
		LocalDate data2 =  LocalDate.of(1990,8,26);
		
		Cliente g1 = new Cliente ("Daisy Santos" , 25 , "123.456.789-00", data , 1.5);
		g1.visualizar();
		
		
		Cliente g2 = new Cliente ("Wellington Novais" , 26 , "001.456.789.11", data2 , 1.8);
		g2.visualizar();
		
		PessoaFisica p1 = new PessoaFisica ("Daisy Santos" , 25 , "123.456.789-00", data , 1.5, "PF");
		p1.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica ("Wellington Novais" , 26 , "001.456.789.11", data , 1.8, "PJ" , "MEI");
		pj1.visualizar();	
	}

}

