import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola<String> cola = new Cola<>();
        int opcion;

        do {
            System.out.println("\n--- COLA DE CLIENTES ---");
            System.out.println("1. Llegada");
            System.out.println("2. Atender");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    cola.encolar(nombre);
                    System.out.println("Cliente añadido a la cola.");
                    break;

                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes esperando.");
                    } else {
                        System.out.println("Cliente atendido: " + cola.desencolar());
                    }
                    break;

                case 3:
                    System.out.println("\nClientes en espera:");
                    cola.mostrar();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
