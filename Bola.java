package senai_llp_variaveis_geometria;
import java.util.Scanner;
import java.util.Locale;
public class Bola {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("digite o raio da bola: ");
        double raio = leitor.nextDouble();
        double area = 4 * Math.PI * Math.pow(raio, 2);
        System.out.printf("a area da superficie da bola é: %.2f%n", area);
        leitor.close();
    }
}
//SNK PRODUCTIONS
