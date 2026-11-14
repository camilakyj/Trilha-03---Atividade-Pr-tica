package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavraOriginal = sc.nextLine();
        String palavraSoletrada = "";

        while (true) {
            String letra = sc.nextLine();

            if (letra.equals("0")) {
                break;
            }

            palavraSoletrada += letra;
        }

        System.out.println("Palavra original: " + palavraOriginal);
        System.out.println("Palavra soletrada: " + palavraSoletrada);

        sc.close();
    }
}
