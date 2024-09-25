public class Deciciones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 2023;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

//        if (fechaDeLanzamiento >= 2022) {
//            System.out.println("Peliculas mas populares");
//        } else {
//            System.out.println("Peliculas Retro que aúm vale la pena ver");
//        }

        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
            System.out.println("Que disfrute de su pelicula!!! :V");
        } else {
            System.out.println("Película no disponible para su plan actual, pobre");
        }

    }
}
