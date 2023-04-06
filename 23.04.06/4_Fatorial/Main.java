import java.util.Scanner;

// Cálculo do fatorial de um número

public class Main {
    public static int lerNumero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextInt();
    }
    public static int calcularFatorial(int numero){
        int fatorial = numero;
        // caso N=0 ou N=1
        if (numero <= 1)
            return 1;
        for (int n = 1; n < numero; n++)
            fatorial *= (numero-n);
        return fatorial;
    }
    public static void main(String[] args){
        int numero = lerNumero("Obter fatorial do número");
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}