package senai_llp_variaveis_geometria;
import java.util.Scanner;
public class Tubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area do Tubo (Cilindro)");
        System.out.print("raio da base: ");
        double r = sc.nextDouble();
        System.out.print("altura: ");
        double h = sc.nextDouble();
        double area = 2 * Math.PI * r * (r + h);
        System.out.printf("a area total é: %.2f%n", area);
    }
}