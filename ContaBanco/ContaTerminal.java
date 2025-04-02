package ContaBanco;
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
 public static void main(String[] args) {
    double saldoInicial = 237.48;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println (" Por favor digite o número da conta ");
    int conta = scanner.nextInt();

    System.out.println ("Por favor digite o número da agência");
    String agencia = scanner.next();

    System.out.println (" Por favor digite o seu Nome ");
    String nome1 = scanner.next();

    System.out.println ("Por favor digite o seu sobrenome");
    String sobrenome1 = scanner.next();

    System.out.println(" Olá " + nome1.toUpperCase() + sobrenome1.toUpperCase() );
    System.out.println ("obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + (" e ") + ("conta") + (" ") + conta +  ( " seu saldo ") + saldoInicial + (" já está disponpivel para saque.") );

    scanner.close();
 }
}
