package Vista;

import Controller.TitularController;
import Dao.TitularDao;
import Modelo.Titular;

import java.util.Scanner;

public class Menu {

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========MENU========\n" +
                "1.- Añadir titular\n" +
                "2.- Eliminar titular\n" +
                "3.- Buscar titular");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                añadirTitular();
                break;
                case 2:
                    eliminarTitular();
                    break;
                    case 3:
                        buscarTitular();
                        break;
        }

    }

    public static void añadirTitular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del titular: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el dni del titular: ");
        String dni = sc.nextLine();
        TitularController.crearTitular(nombre, dni);
    }
    public static void eliminarTitular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del titular que quiere borrar: ");
        String nombre = sc.nextLine();

    }
    public static void buscarTitular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del titular que desea buscar: ");
        String nombre = sc.nextLine();
        String titular = TitularController.buscarTitular(nombre);
        System.out.println(titular);
    }
}
