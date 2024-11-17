import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        if (valor1 == valor2) {
                System.out.println("Voce digitou valores iguais");
        }
        else if (valor1 > valor2) {
                System.out.println("O primeiro valor é o maior dos dois");
        }
        else {
                System.out.println("o segundo valor é o maior dos dois");
        }
        sc.close();
    }

}