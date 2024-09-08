import java.util.Locale;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, base, altura;

        System.out.print(" Digite a base do Rêtangulo: ");
        base = sc.nextDouble();

        System.out.print(" Digite a altura do Rêtangulo: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.println("A base do Rêtangulo calculada é: " + String.format("%.1f", area));

        sc.close();
        
    }
    
}
