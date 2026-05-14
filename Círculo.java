package senai_llp_variaveis_geometria;
import java.util.Scanner;
public class Círculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area do circulo");
        System.out.print("digite o raio: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("a area é: %.2f%n", area);
    }
}