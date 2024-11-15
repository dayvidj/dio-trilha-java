import java.util.ArrayList;
import java.util.List;

public class Banco {
	private final String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return new ArrayList<>(contas); //Retorna uma cópia para evitar manipulação externa direta
	}

	public void adicionarConta(Conta conta) {
		if (conta != null) {
			contas.add(conta);
		}
	}

	public boolean removerConta(Conta conta) {
		return contas.remove(conta);
	}
}
