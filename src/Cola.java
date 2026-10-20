public class Cola <T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    // Añade un elemento al final de la cola
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (isEmpty()) {
            primero = nuevo;
        } else {
            ultimo.siguiente = nuevo;
        }

        ultimo = nuevo;
    }

    // Extrae el primer elemento de la cola
    public T desencolar() {
        if (isEmpty()) {
            return null;
        }

        T dato = primero.dato;
        primero = primero.siguiente;

        if (primero == null) {
            ultimo = null;
        }

        return dato;
    }

    // Comprueba si la cola está vacía
    public boolean isEmpty() {
        return primero == null;
    }

    // Muestra los elementos de la cola
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo<T> actual = primero;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
