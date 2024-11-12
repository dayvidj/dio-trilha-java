import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ContaTerminal conta = new ContaTerminal();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do Cliente: ");
		conta.setNomeCliente(sc.nextLine());
		System.out.println("Digite o número da Agência: ");
		conta.setAgencia(sc.nextLine());
		System.out.println("Digite o número da Conta: ");
		conta.setNumero(sc.nextInt());
		System.out.println("Digite o o Saldo: ");
		conta.setSaldo(sc.nextBigDecimal());

		System.out.println("Olá " + conta.getNomeCliente()
				+ ", obrigado por criar uma conta em nosso banco, sua agência é: " + conta.getAgencia() + ", conta "
				+ conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

		sc.close();
	}

}
