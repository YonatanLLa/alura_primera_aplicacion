import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String name = "Tony Stark";
        String cuenta = "Corriente";
        double saldo = 2999;
        double saldoRetirar = 0;
        boolean badera = true;
        double saldoTotal = saldo;
        System.out.println("Nombre del cliente: " + name);
        System.out.println("Tipo de cuenta: " + cuenta);
        System.out.println("Saldo Disponible "+ saldo + "$");
        System.out.println("**********************************");


        while (badera) {
            System.out.println();
            System.out.println("** Escriba la opcion deseada **");
            System.out.println("1 - Cosultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            System.out.println();

            int option = teclado.nextInt();
            switch (option){
                case 1:

                    System.out.println("Saldo actualizado es: " + saldoTotal);
                    continue;
                case 2:
                    System.out.println("¿Cual es el valor que deseas retirar?");
                    saldoRetirar = teclado.nextDouble();

                    if (saldo < saldoRetirar) {
                        System.out.println("El valor que ingresaste sobrepasa tu saldo de " + saldoTotal);
                        continue;
                    }
                    saldoTotal = saldo - saldoRetirar;
                    System.out.println("Saldo restante: " + saldoTotal);
                    continue;
                case 3:
                    System.out.println("¿Cual es el valor que desas depositar?");
                    saldoRetirar = teclado.nextDouble();
                    saldoTotal += saldoRetirar;
                    saldo = saldoTotal;
                    System.out.println("Saldo actual: " + saldoTotal);
                    continue;

                case 9:
                    badera = false;
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Ingresa un dato valido");
            }
        }

    }
}
