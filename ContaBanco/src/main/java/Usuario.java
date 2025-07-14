import java.util.Locale;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ContaTerminal  contaTerminal = new ContaTerminal();

        System.out.print("Digite o número da Conta: ");
           contaTerminal.numero = sc.nextInt();

        System.out.print("Digite a Agência: ");
            contaTerminal.agencia = sc.next();

        System.out.print("Digite o seu Nome: ");
            contaTerminal.nomeDoCliente = sc.next();

        System.out.print("Digite seu Saldo: ");
            contaTerminal.saldo = sc.nextDouble();

        System.out.print("Olá "+ contaTerminal.nomeDoCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ contaTerminal.agencia +", " +
                "conta "+ contaTerminal.numero +" e seu saldo "+ contaTerminal.saldo +" já está disponível para saque");








    }




}
