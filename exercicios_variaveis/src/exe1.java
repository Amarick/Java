import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2.0 ;

        System.out.println("media: " + media);
    }
}
