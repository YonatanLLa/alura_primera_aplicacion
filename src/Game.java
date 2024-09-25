import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;
        int numeroAdivinar = new Random().nextInt(100);
        System.out.println(numeroAdivinar);

        for (int i = 0; i < 5; i++) {
            System.out.println("Adivina el numero del 0 al 100: ");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado == numeroAdivinar) {
                System.out.println("Numero fue adivinado");
                break;
            }
            if (i == 4) {
                System.out.println("Perdiste el numero es " + numeroAdivinar);
                break;
            }
            if (numeroAdivinar > numeroIngresado) {
                System.out.println("Ingresa un numero mayor");
            } else {
                System.out.println("Ingresa un numero menor");
            }

        }
    }
}
