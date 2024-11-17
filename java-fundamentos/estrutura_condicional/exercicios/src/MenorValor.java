import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Entre com o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.println("Entre com o segundo valor: ");
        valor2 = sc.nextInt();

        if (valor1 == valor2) {
            System.out.println("Voce digitou numeros iguais");
        }
        else if (valor1 < valor2) {
            System.out.println("O primeiro valor é o menor dos dois");
        }
        else {
            System.out.println("O segundo valor é o menor dos dois");
        }
        sc.close();
    }
}
