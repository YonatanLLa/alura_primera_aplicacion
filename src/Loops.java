import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias aa la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluciones = mediaEvaluciones + nota;
        }
        System.out.println("La media de evaluciones de matrix es: " + mediaEvaluciones/3);
    }
}
