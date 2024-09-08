import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Double area, base, altura;

    System.out.print(" Digite a base do triangulo: ");
    base = sc.nextDouble();

    System.out.print(" Digite a altura do triangulo: ");
    altura = sc.nextDouble();

    area = base * altura / 2;

    System.out.print("A area do triangulo é: " + String.format("%.2f", area));

    sc.close();
}
}