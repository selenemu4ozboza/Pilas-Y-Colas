public class Pila<T> {
    private Nodo<T> cima;

    public Pila() {
        cima = null;
    }

    // Añade un elemento a la pila
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    // Extrae el último elemento añadido
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    // Comprueba si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }

}
