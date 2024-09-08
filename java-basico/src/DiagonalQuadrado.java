import java.util.Locale;
import java.util.Scanner;

public class DiagonalQuadrado {
    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double area, diagonal;

    System.out.print(" Digite o valor da diagonal: ");
    diagonal = sc.nextDouble();

    area = (diagonal * diagonal)  / 2;

    System.out.println("A area do quadrado a partir da diagonal: " + String.format("%.2f", area));
    
    sc.close();


}
}
