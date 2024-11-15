
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João");
		Cliente cliente2 = new Cliente("Maria");

		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente2);

		try {
			cc.depositar(500.0);
			cc.sacar(100.0);
			cc.transferir(50.0, cp);

			cc.sacar(400.0); //Vai lançar a exception
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (ContaNaoInformadaException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
