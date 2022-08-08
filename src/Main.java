
public class Main {

	public static void main(String[] args) {
		Cliente amanda = new Cliente();
		amanda.setNome("Amanda Ribeiro");
		
		Conta cc = new ContaCorrente(amanda);
		Conta poupanca = new ContaPoupanca(amanda);

		cc.depositar(700);
		cc.transferir(230, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}