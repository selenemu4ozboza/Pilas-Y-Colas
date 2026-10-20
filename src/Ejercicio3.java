import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Pila<Character> pila = new Pila<>();
        Cola<Character> cola = new Cola<>();

        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine();

        // Convertimos a minúsculas y eliminamos los espacios
        texto = texto.toLowerCase().replace(" ", "");

        // Introducimos los caracteres en la pila y la cola
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
            cola.encolar(texto.charAt(i));
        }

        boolean esPalindromo = true;

        // Comparamos los caracteres en ambos sentidos
        while (!pila.isEmpty() && !cola.isEmpty()) {
            if (!pila.pop().equals(cola.desencolar())) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El texto es palíndromo.");
        } else {
            System.out.println("El texto no es palíndromo.");
        }

        sc.close();
    }
}
