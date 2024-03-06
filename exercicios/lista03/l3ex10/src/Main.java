import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a sequência de Fibonacci até o enésimo termo: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        int anterior = 0;
        int atual = 1;
        System.out.print(anterior + ", " + atual);

        for (int i = 2; i < n; i++) {
            int proximo = anterior + atual;
            System.out.print(", " + proximo);
            anterior = atual;
            atual = proximo;
        }

        System.out.println();
    }
}
