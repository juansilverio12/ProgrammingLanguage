import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior, menor;

        System.out.print("Digite o primeiro número: ");
        int numero = scanner.nextInt();
        maior = numero;
        menor = numero;

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
    }
}
