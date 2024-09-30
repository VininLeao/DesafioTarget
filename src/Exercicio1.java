import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        int a = 0;
        int b = 1;
        for (int i = 0; a < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == n;
    }
}