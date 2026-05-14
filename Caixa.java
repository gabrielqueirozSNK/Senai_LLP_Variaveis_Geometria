package senai_llp_variaveis_geometria;
import java.util.Scanner;
public class Caixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area da caixa (superficie)");
        System.out.print("comprimento (a): ");
        double a = sc.nextDouble();
        System.out.print("largura (b): ");
        double b = sc.nextDouble();
        System.out.print("altura (c): ");
        double c = sc.nextDouble();
        double area = 2 * (a*b + a*c + b*c);
        System.out.println("a área total da superficie é: " + area);
    }
}
//SNK PRODUCTIONS
