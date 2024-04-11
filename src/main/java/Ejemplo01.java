import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);
    }
}
