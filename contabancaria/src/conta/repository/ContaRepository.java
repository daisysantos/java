package conta.repository;

public interface ContaRepository {

	//CRUD de Conta
	public void procurarPorNumero (int numero); // vai prucurar o número da conta do cliente
	public void listarTodas(); // Vai listar todas as contas
	public void cadastrar(Conta conta); // vou importar da classe conta
	public void atualizar(Conta conta); // enviar o objeto da classe conta e ele vai substituir o que está salvo no momento
	public void deletar(int numero); // apagar a conta de acordo com o número da conta
	
	//Métodos Bancários (saque, deposito e transferência)
	
	public void sacar(int numero, float valor);
	public void deposito(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
