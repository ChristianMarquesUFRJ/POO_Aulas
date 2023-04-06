// Calculo da area de 2 circulos

public class Main {
    static double PI = 3.14159;
    static double raio_1_cm = 5.0;
    static double raio_2_cm = 3.5;
    public static double calcularArea(double raio){
        return (raio * raio * PI);
    }
    public static void main(String[] args){
        System.out.println("Area[R1(" + raio_1_cm + "cm)] = " + calcularArea(raio_1_cm) + "cm²");
        System.out.println("Area[R2(" + raio_2_cm + "cm)] = " + calcularArea(raio_2_cm) + "cm²");
    }
}