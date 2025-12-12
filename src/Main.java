import java.util.HashSet;
import java.util.*;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public enum Posicion {
        DELANTERO, MEDIO, DEFENSA, PORTERO
    }

    static Set<String> nombres = new HashSet<>();
    static Set<Posicion> posiciones = new HashSet<>();

    public static void darAlta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("como se llama el jugador?");
        System.out.print("Nombre: ");
        nombres.add(sc.nextLine());

        System.out.print("que posicion es el jugador? ");
        String posTexto = sc.nextLine().toUpperCase();

        try {
            Posicion pos = Posicion.valueOf(posTexto);
            posiciones.add(pos);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: esa posición no existe.");
        }
    }

    public static void modificarJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("como se llama el jugador?");
        String nombre = sc.nextLine();
        if (nombres.contains(nombre)) {
            posiciones.clear();
            System.out.print("que posicion deseas introoducir?");
            String nuevaPos = sc.nextLine().toUpperCase();
            posiciones.add(Posicion.valueOf(nuevaPos));
            System.out.println("Posición modificada.");
        } else {
            System.out.println("El jugador no existe.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("=============MENU============\n" +
                "1.-introducir jugador\n" +
                "2.-modificar jugador\n" +
                "3.-eliminar jugador");
        System.out.print("que vas a introducir? ");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                darAlta();
                break;
            case 2:
                modificarJugador();
                break;
        }

    }
}

