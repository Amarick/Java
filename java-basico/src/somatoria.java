import java.util.Locale;
import java.util.Scanner;

public class somatoria {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  troco, somaProdutos, produto1, produto2, produto3, produto4, produto5, pagamento;

        System.out.print(" Digite o preço do primeiro produto: ");
        produto1 = sc.nextDouble();

        System.out.print(" Digite o preço do segundo produto: ");
        produto2 = sc.nextDouble();

        System.out.print(" Digite o preço do terceiro produto: ");
        produto3 = sc.nextDouble();

        System.out.print(" Digite o preço do quarto produto: ");
        produto4 = sc.nextDouble();

        System.out.print(" Digite o preço do quinto produto: ");
        produto5 = sc.nextDouble();

        somaProdutos = (produto1 + produto2 + produto3 + produto4 + produto5);

        System.out.print("Valor á pagar: R$" + String.format("%.2f", somaProdutos));
        System.out.print(" Entre com o valor do Pagamento: R$");
        sc.nextLine();
        pagamento = sc.nextDouble();

        
        System.out.println((" O pagamento no valor de R$" + String.format( "%.2f ", pagamento)) + " foi Recebido");
    
        troco = pagamento - somaProdutos;
        System.out.print("Seu troco: R$" + troco) ;
        sc.close();

    }
    
}
