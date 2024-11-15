
public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor do saque deve ser positivo.");
		}
		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
		}
		saldo -= valor;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor do depósito deve ser positivo.");
		}
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		if (contaDestino == null) {
            throw new ContaNaoInformadaException("Conta de destino não pode ser nula.");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
        return String.format("Conta {Agencia: %d, Número: %d, Titular: %s, Saldo: %.2f}",
                agencia, numero, cliente.getNome(), saldo);
    }

    protected abstract void imprimirExtrato();
    
	protected void imprimirInfosComuns() {
		System.out.println(this.toString());
	}

}
