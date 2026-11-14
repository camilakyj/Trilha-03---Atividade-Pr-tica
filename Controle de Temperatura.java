package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double temperatura;
        double maior = 0;
        double menor = 0;
        boolean primeira = true;

        while (true) {
            temperatura = sc.nextDouble();

            if (temperatura == 0) {
                break;
            }

            if (temperatura < -50 || temperatura > 60) {
                System.out.println("Temperatura inválida");
                continue;
            }

            if (primeira) {
                maior = temperatura;
                menor = temperatura;
                primeira = false;
            } else {
                if (temperatura > maior) {
                    maior = temperatura;
                }

                if (temperatura < menor) {
                    menor = temperatura;
                }
            }
        }
