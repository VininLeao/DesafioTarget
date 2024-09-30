import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();
        scanner.close();

        int cont = contarOcorrenciasDeA(entrada);

        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int contarOcorrenciasDeA(String str) {
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }
        return cont;
    }
}