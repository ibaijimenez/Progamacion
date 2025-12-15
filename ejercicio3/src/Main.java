import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Stack<String> pilaLibros = new Stack<>();
    public static void añadirLibro() {
            Scanner sc = new Scanner(System.in);
            // Pedir el título al usuario
            System.out.print("Ingrese el título del libro: ");
            String titulo = sc.nextLine();

            // Colocar en la parte superior de la pila (push)
            pilaLibros.push(titulo);

            System.out.println("Libro agregado a la pila: " + pilaLibros);
        }
        public static void verLibro() {
        if (!pilaLibros.isEmpty()) {
            String libroArriba = pilaLibros.peek();
            System.out.println("El libro de arriba es: " + libroArriba);
        }
        else  {
            System.out.println("la pila esta vacia");
        }
        }
        public static void eliminarLibro() {
        if (!pilaLibros.isEmpty()) {
            String libroArriba = pilaLibros.pop();
            System.out.println("El libro eliminado es: " + libroArriba);
        }
        else {
            System.out.println("la pila esta vacia");
        }
        }
        public static void verLibros() {
        if (!pilaLibros.isEmpty()) {
            System.out.println("Libros en la pila (del más reciente al más antiguo):");
            for (int i = pilaLibros.size() - 1; i >= 0; i--) {
                System.out.println("- " + pilaLibros.get(i));
            }
        }
        else {
            System.out.println("la pila esta vacia");
        }
        }
        public static void verificarFila() {
        if (!pilaLibros.isEmpty()) {
            System.out.println("la pila NO esta vacia");
        }
        else {
            System.out.println("la pila esta vacia");
        }
        }
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("================MENU================\n" +
                    "a) Anadir un libro a la pila:\n" +
                    "b) Consultar el libro en la parte superior: \n" +
                    "c) Retirar el libro en la parte superior: \n" +
                    "d) Mostrar todos los libros en la pila \n" +
                    "e) Verificar si la pila esta vacia: \n" +
                    "f) Salir del programa");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "a":
                    añadirLibro();
                    break;
                case "b":
                    verLibro();
                    break;
                case "c":
                    eliminarLibro();
                    break;
                case "d":
                    verLibros();
                    break;
                case "e":
                    verificarFila();
                    break;
                case "f":
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}