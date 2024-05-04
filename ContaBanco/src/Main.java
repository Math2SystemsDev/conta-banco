import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência e pressione ENTER:");
        conta.agencia = myScanner.nextLine();

        System.out.println("Digite o número da conta e pressione ENTER:");
        conta.numero = myScanner.nextInt();
        myScanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite seu nome e pressione ENTER:");
        conta.nomeCliente = myScanner.nextLine();

        System.out.println("Digite seu saldo:");
        conta.saldo = myScanner.nextDouble();

        System.out.println("Olá " + conta.nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");
    }
}
