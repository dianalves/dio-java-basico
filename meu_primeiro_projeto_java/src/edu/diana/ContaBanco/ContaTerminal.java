package edu.diana.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua conta");
        int numero = scanner.nextInt();
        System.out.println("Digite a sua Agência");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        System.out.println("Digite o seu saldo");
        double saldo= scanner.nextDouble();

        System.out.println("Ola," + nome + " obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo R$ " + saldo + " já está disponivel para saque.");
        System.out.println("Obrigada por confiar em nos! ");
        scanner.close();

    }
}
