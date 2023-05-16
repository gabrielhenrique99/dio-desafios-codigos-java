import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, me informe seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o número de sua agência");
        String agencia = scanner.next();
        System.out.println("Por favor, me informe o número de sua conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, me informe o saldo de sua conta: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        
    }
}
