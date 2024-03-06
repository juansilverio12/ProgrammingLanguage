import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo maior que 1: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = verificarPrimo(numero);

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static boolean verificarPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {

            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
