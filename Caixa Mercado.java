package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double valor;
        double total = 0;

        while (true) {
            valor = sc.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.println("Valor inválido: " + valor);
            } else {
                total += valor;
            }
        }

        int parcelas = sc.nextInt();

        if (parcelas <= 1) {
            System.out.printf(Locale.US, "Pagamento à vista: R$ %.2f%n", total);
        } else {
            double valorParcela = total / parcelas;

            System.out.printf(Locale.US, "Total da compra: R$ %.2f%n", total);
            System.out.printf(Locale.US, "Parcelado em %dx de R$ %.2f%n",
                    parcelas, valorParcela);
        }

        sc.close();
    }
}
