import java.util.Scanner;
import java.util.Locale;

public class Leitura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu filme favorito: ");
        String filme = sc.nextLine();

        System.out.println("digite o ano do filme");
        int anoDeLancamento = sc.nextInt();

        System.out.println("Digite a nota do filme");
        double nota = sc.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(nota);
    }
}
