import java.util.Locale;
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, valorAresta;

        System.out.print(" Digite o valor da aresta: ");
        valorAresta = sc.nextDouble();

        area = valorAresta * valorAresta;

        System.out.println(" a área do quadrado calculada é: " + String.format("%.2f", area));

        sc.close();


    }
}
