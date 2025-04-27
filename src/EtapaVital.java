import java.util.Scanner;

public class EtapaVital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos años tienes?: ");
        int edad = scanner.nextInt();

        if (edad < 6 || edad > 120) {
            throw new IllegalArgumentException("Error: Edad no válida. La edad debe estar entre 6 y 120.");
        }  else if (edad <= 12) {
            System.out.println("Estás en primaria");
        } else if (edad <= 16) {
            System.out.println("Estás en secundaria");
        } else if (edad <= 22) {
            System.out.println("Estás en la universidad");
        } else {
            System.out.println("Estás trabajando");
        }

        scanner.close();
    }
}
