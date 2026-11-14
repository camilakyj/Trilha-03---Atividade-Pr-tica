package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicao = sc.nextInt();

        if (posicao <= 0) {
            System.out.println("Posição inválida");
        } else {
            long primeiro = 1;
            long segundo = 1;
            long resultado = 1;

            for (int i = 3; i <= posicao; i++) {
                resultado = primeiro + segundo;
                primeiro = segundo;
                segundo = resultado;
            }

            System.out.println("O valor na posição " + posicao +
                    " da sequência de Fibonacci é " + resultado);
        }

        sc.close();
    }
}
