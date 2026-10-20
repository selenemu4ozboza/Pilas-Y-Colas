import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pila<Character> pila = new Pila<>();

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        // Guardamos cada carácter en la pila
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        StringBuilder invertido = new StringBuilder();

        // Extraemos los caracteres en orden inverso
        while (!pila.isEmpty()) {
            invertido.append(pila.pop());
        }

        System.out.println("Texto invertido: " + invertido);

        sc.close();
    }
}
