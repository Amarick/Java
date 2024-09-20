import java.util.Locale;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, base, altura;

        System.out.println("Digite o valor da base: ");
        base = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();

        area = base * altura;
        if (area >= 100) {
            System.out.printf("Area do terreno %.2f\n", area);
            System.out.println("Terreno grande");
        }
        else {
            System.out.println("A area do terreno não passou de 100");
            System.out.printf("Area do terreno  %.2f", area);

        }

        sc.close();





    }
}
