import java.util.Scanner;

// Cálculo de media e status do aluno

public class Main {
    public static double lerNota(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextDouble();
    }
    public static void main(String[] args){
        double N1 = lerNota("Nota 1");
        double N2 = lerNota("Nota 2");
        double media = (N1 + N2)/2.0;
        if (media < 3.0)
            System.out.println("REPROVADO. Uma vez que " + media + " é < 3");
        else if (media >= 7.0)
            System.out.println("APROVADO. Uma vez que " + media + " é >= 7");
        else
            System.out.println("PROVA FINAL. Uma vez que " + media + " é >= 3 e < 7");
    }
}