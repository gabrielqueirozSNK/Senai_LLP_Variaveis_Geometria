package senai_llp_variaveis_geometria;
import java.util.Scanner;
public class Triângulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area do triangulo ---");
        System.out.print("digite a base: ");
        double base = sc.nextDouble();
        System.out.print("digite a altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("área é: " + area);
    }
}
//SNK PRODUCTIONS
