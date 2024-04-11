import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe tu nombre");

        String texto = sc.nextLine();

        Analizador an = new Analizador();

        int v = an.cuentaVocales(texto);
        int n = an.cuentaNumeros(texto);

        System.out.println("Hay " + v + " vocales");
        System.out.println("Hay " + n + " numeros");
    }
}
