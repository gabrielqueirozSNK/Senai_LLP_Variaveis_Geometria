package senai_llp_variaveis_geometria;
import java.util.Scanner;
public class Pirâmide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area da piramide (Base Quadrada)");
        System.out.print("lado da base: ");
        double lado = sc.nextDouble();
        System.out.print("apotema (altura do triangulo lateral): ");
        double apotema = sc.nextDouble();
        double areaBase = lado * lado;
        double areaLateral = 4 * ((lado * apotema) / 2);
        System.out.println("a area total e: " + (areaBase + areaLateral));
    }
}