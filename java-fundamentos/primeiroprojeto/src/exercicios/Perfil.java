package exercicios;
import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, qual o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Ola," + nome);


    }
}
