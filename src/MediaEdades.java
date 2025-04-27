import java.util.Scanner;

public class MediaEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de tu madre: ");
        String nombreMadre = scanner.next();

        System.out.println("Introduce la edad de tu madre: ");
        int edadMadre = scanner.nextInt();

        System.out.println("Introduce el nombre de tu padre: ");
        String nombrePadre = scanner.next();

        System.out.println("Introduce la edad de tu padre: ");
        int edadPadre = scanner.nextInt();

        double mediaEdades = (edadMadre +  edadPadre)/2.0;

        System.out.println("Tu madre se llama " + nombreMadre + " y tiene " + edadMadre + " años, y tu padre se llama " + nombrePadre + " y tiene " + edadPadre + " años, y la media de sus edades es " + mediaEdades);

        scanner.close();
    }
}
