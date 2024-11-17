package exercicios;
import java.util.Scanner;

public class Perfil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me diga seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Ola," + nome);
        System.out.println("Tudo bem");
    }
}
