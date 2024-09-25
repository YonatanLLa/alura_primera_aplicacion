//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsiss = """
                Matrix es una paradoja 
                La mejor película del fin del milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println(sinopsiss);

        int clasifficacion  = (int) (media / 2);

        System.out.println(clasifficacion);



    }
}