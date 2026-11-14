package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double saldo = 0;
        int opcao;

        do {
            System.out.println("Menu de Opções");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Saque");
            System.out.println("0. Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf(Locale.US, "Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    double deposito = sc.nextDouble();

                    if (deposito < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo += deposito;
                    }
                    break;

                case 3:
                    double saque = sc.nextDouble();

                    if (saque < 0) {
                        System.out.println("Valor inválido");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}

