import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int x = sc.nextInt();

        System.out.println("Digite um numero: ");
        int soma = 0;
        while (x != 0) {
            System.out.println("Digite um numero, ou zero para parar a somatoria: ");
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();

    }
}