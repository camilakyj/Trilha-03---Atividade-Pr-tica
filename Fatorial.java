package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Parâmetro inválido.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        }

        sc.close();
    }
}
