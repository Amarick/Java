import java.util.Scanner;
import java.util.Locale;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        
        int valorInteiro = (int) valor;

        System.out.println("Casting para inteiro: " + valorInteiro);

    }
}
