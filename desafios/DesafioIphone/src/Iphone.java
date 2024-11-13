
public class Iphone {

	private ReprodutorMusical reprodutorMusical;
	private AparelhoTelefonico aparelhoTelefonico;
	private NavegadorInternet navegadorInternet;

	public void tocar() {
		reprodutorMusical.tocar();
	}

	public void pausar() {
		reprodutorMusical.pausar();
	}

	public void ligar(String numero) {
		aparelhoTelefonico.ligar("numero");
	}

	public void atender() {
		aparelhoTelefonico.atender();
	}

	public void exibirPagina(String url) {
		navegadorInternet.exibirPagina(url);
	}

	public void atualizarPagina() {
		navegadorInternet.atualizarPagina();
	}

	public void novaAba() {
		navegadorInternet.novaAba();
	}
	
}
