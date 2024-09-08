import java.util.Locale;

public class variavel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5000.5;
        altura = 1.73;
        genero = 'f';
        nome = "Maria";

        System.out.println("IDADE = " + idade);
        System.out.println("SALARIO = " + String.format("%.2f", salario));
        System.out.println("ALTURA = " + String.format("%.2f", altura));
        System.out.println("GENERO = " + genero);
        System.out.println("NOME = " + nome);
    }
}
