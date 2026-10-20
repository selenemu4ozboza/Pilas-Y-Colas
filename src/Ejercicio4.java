import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pila<Integer> pila = new Pila<>();

        System.out.print("Introduce un número decimal positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {

            // Guardamos los restos de las divisiones entre 2
            if (numero == 0) {
                pila.push(0);
            }

            while (numero > 0) {
                pila.push(numero % 2);
                numero = numero / 2;
            }

            StringBuilder binario = new StringBuilder();

            // Extraemos los restos para formar el número binario
            while (!pila.isEmpty()) {
                binario.append(pila.pop());
            }

            System.out.println("Número en binario: " + binario);
        }

        sc.close();
    }
}

