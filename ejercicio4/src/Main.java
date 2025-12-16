import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Map<Integer, String> agenda = new HashMap<>();

    public static void añadirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre del contacto");
        String nombre = sc.nextLine();
        System.out.println("introduce el numero del contacto");
        int numero = sc.nextInt();
        if (agenda.containsKey(numero)) {
            System.out.println("El contacto ya existe");
        }
        else {
            agenda.put(numero, nombre);
        }
    }
    public static void borrarNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero del contacto que desea eliminar");
        int numero = sc.nextInt();
        if (agenda.containsKey(numero)) {
            agenda.remove(numero);
        }
        else {
            System.out.println("El contacto no existe");
        }
    }
    public static void  buscarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero del contacto que desea buscar");
        int numero = sc.nextInt();
        if (agenda.containsKey(numero)) {
            System.out.println("El contacto ha sido encontrado" + agenda.get(numero));
        }
        else  {
            System.out.println("El contacto no existe");
        }
    }
    public static void eliminarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre del contacto a eliminar");
        String nombre = sc.nextLine();
        boolean eliminado = false;
        for (Map.Entry<Integer, String> entrada : agenda.entrySet()) {
            if (entrada.getKey().equals(nombre)) {
                agenda.remove(entrada.getKey());
                eliminado = true;
        }
        if (!eliminado) {
            System.out.println("El contacto no existe");
        }
    }
    }
    public static void buscarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre del contacto");
        String nombre = sc.nextLine();
        boolean encontrado = false;
        for (Map.Entry<Integer, String> entrada : agenda.entrySet()) {
            if (entrada.getKey().equals(nombre)) {
                System.out.println("El contacto ha sido encontrado" + entrada.getValue());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto no existe");
        }
    }
    public static void main(String[] args) {
    do {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("===========MENU===========\n" +
                    "1.- Anadir un nuevo numero\n" +
                    "2.- Borrar un numero\n" +
                    "3.- Buscar un numero.\n" +
                    "4.- Borrar por nombre.\n" +
                    "5.- Buscar por nombre\n" +
                    "6.- Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    añadirNumeros();
                    break;
                    case 2:
                        borrarNumeros();
                        break;
                        case 3:
                            buscarNumero();
                            break;
                            case 4:
                                eliminarNombre();
                                break;
                            case 5:
                                buscarNombre();
                                break;
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    while (true);
    }
}