import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Digite a base do triângulo retângulo:");
        base = in.nextDouble();

        System.out.println("Digite a altura do triângulo retângulo:");
        altura = in.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo retângulo é: " + area);
    }
}
