package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int altura = sc.nextInt();

        if (base <= 0 || altura <= 0) {
            System.out.println("Retângulo inválido");
        } else {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= base; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        }

        sc.close();
    }
}

