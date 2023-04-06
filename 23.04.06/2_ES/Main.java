import java.util.Scanner;

// Interação com Entrada do teclado

public class Main {
    public static String lerNome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();
        return nome;
    }
    public static int lerIdade(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira sua Idade: ");
        int idade = sc.nextInt();
        return idade;
    }
    public static double lerAltura(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira sua altura: ");
        double altura = sc.nextDouble();
        return altura;
    }
    public static void main(String[] args){
        String nome = lerNome();
        int idade = lerIdade();
        double altura = lerAltura();
        System.out.println("\nDeixa eu ver se entendi, " + nome + "...");
        System.out.println("Você tem " + idade + " anos");
        System.out.println("E mede " + altura + "m");
        System.out.println("Certo!?");
    }
}