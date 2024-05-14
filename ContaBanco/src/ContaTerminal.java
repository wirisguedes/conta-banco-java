import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá seja bem vindo");

        System.out.println("Por favor, digite o seu nome ! (depois ENTER para o próximo campo)");
        String nome = scanner.next();

        System.out.println("Pr favor, digite Agencia ! (depois ENTER para o próximo campo)");
        String agencia = scanner.next();

        System.out.println("Por favor, digite nuúmero conta ! (depois ENTER para o próximo campo)");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite valor a depositar ! (depois ENTER para o próximo campo)");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque");






    }
}
