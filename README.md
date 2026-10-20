# UD01 - Ejercicios de Pilas y Colas en Java

## Descripción

Este proyecto corresponde a la asignatura **Programación de Servicios y Procesos de 2º DAM**.

El objetivo de la actividad es aprender a utilizar estructuras de datos dinámicas, concretamente pilas y colas, mediante la realización de cuatro ejercicios en Java.

Para ello, se han creado clases propias que permiten reutilizar código entre los diferentes ejercicios.

## Ejercicios realizados

### Ejercicio 1. Invertir una cadena de texto

El programa solicita al usuario una frase o palabra y la invierte utilizando una pila.

Se utilizan las operaciones `push()`, `pop()` e `isEmpty()`.

**Ejemplo:**

```text
Introduce un texto: Hola mundo
Texto invertido: odnum aloH
```

### Ejercicio 2. Gestión de una cola de clientes

Simula la atención de clientes siguiendo el orden de llegada mediante una cola FIFO (First In, First Out).

El programa dispone de un menú con cuatro opciones:

1. Añadir un cliente.
2. Atender al siguiente cliente.
3. Mostrar los clientes en espera.
4. Salir del programa.

### Ejercicio 3. Comprobar palíndromos

Permite comprobar si una palabra o frase es palíndroma utilizando una pila y una cola simultáneamente.

Antes de realizar la comparación, el programa convierte el texto a minúsculas y elimina los espacios.

**Ejemplo:**

```text
Introduce una palabra o frase: Anita lava la tina
El texto es palíndromo.
```

### Ejercicio 4. Conversión de decimal a binario

Convierte un número decimal positivo a binario mediante una pila.

El programa realiza divisiones sucesivas entre 2 y almacena los restos en la pila para obtener el resultado.

**Ejemplo:**

```text
Introduce un número decimal positivo: 13
Número en binario: 1101
```

## Estructura del proyecto

```text
UD01-Pilas-Colas-Java/
│
├── src/
│   └── main/
│       └── java/
│           ├── Nodo.java
│           ├── Pila.java
│           ├── Cola.java
│           ├── Ejercicio1.java
│           ├── Ejercicio2.java
│           ├── Ejercicio3.java
│           └── Ejercicio4.java
│
├── pom.xml
├── .gitignore
└── README.md
```

## Reutilización de código

Para evitar repetir código, se ha creado la clase genérica `Nodo<T>`, que se utiliza tanto en la implementación de la pila como de la cola.

- **Nodo.java:** almacena los datos y la referencia al siguiente nodo.
- **Pila.java:** implementa una estructura LIFO.
- **Cola.java:** implementa una estructura FIFO.

Estas clases se reutilizan en los cuatro ejercicios.

## Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Maven
- Git y GitHub

## Ejecución

1. Descargar o clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Comprobar que el JDK está configurado.
4. Ejecutar la clase correspondiente al ejercicio que se quiera probar.

Cada ejercicio dispone de su propio método `main()`.

## Conclusión

Con esta actividad he practicado el funcionamiento de las pilas y colas en Java, comprendiendo las diferencias entre LIFO y FIFO.

También he aprendido a reutilizar clases, organizar mejor el código y gestionar las versiones del proyecto mediante Git y GitHub.
