
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, t, x;

        do
        {
            System.out.println("Entre com o numero de uma tabuda ");
            x = sc.nextInt();
        }

        while (x <= 0);

        for(i = 1; i <= 10; i++)
        {
            t = x * i;
            System.out.println(x + " x " + i + " = " + t);
        }
        
        sc.close();

    }
    
}
