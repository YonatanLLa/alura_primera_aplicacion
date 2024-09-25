import java.util.Scanner;

public class Evaluciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluciones = 0;
        double totalEvaluciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darias aa la pelicula Matrix");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaEvaluciones += nota;
                totalEvaluciones++;
            }

        }
        System.out.println("La media de evaluciones de matrix es: " + mediaEvaluciones/ totalEvaluciones);
    }
}
