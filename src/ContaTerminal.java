
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por Favor Digite o numero da conta");
		int numeroConta = sc.nextInt();
		System.out.println("Por Favor informe o numero da Agencia");
		String numeroAgencia = sc.next();
		sc.nextLine();
		System.out.println("Por Favor digite seu nome");
		String nomeCliente = sc.nextLine();
		System.out.println("digite seu saldo");
		double saldo = sc.nextDouble();
		
		System.out.println();
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia + ", conta "+ numeroConta + " e seu saldo "+ saldo + " já esta disponivel para saque." );
	
		sc.close();
	}
}
