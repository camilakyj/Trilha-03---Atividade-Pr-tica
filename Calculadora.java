package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int opcao;

        do {
            System.out.println("Menu de Opções");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + n1 + " + " + n2 + " = " + (n1 + n2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + n1 + " - " + n2 + " = " + (n1 - n2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + n1 + " * " + n2 + " = " + (n1 * n2));
                        break;

                    case 4:
                        if (n2 == 0) {
                            System.out.println("Divisão por zero não permitida");
                        } else {
                            System.out.println("Resultado: " + n1 + " / " + n2 + " = " + (n1 / n2));
                        }
                        break;
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        System.out.println("Fim.");
        sc.close();
    }
}
