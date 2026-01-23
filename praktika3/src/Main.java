import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Libro> libros;
    private static List<Alumnos> alumnos;
    public static void main(String[] args) {
    generarDatos();
    Scanner input = new Scanner(System.in);
    System.out.println("--- MENÚ BIBLIOTECA---\n" +
            "1. Alquilar libro\n" +
            "2. Devolver\n" +
            "3.Ver datos disponibles\n" +
            "0.salir");
    int opcion = input.nextInt();
    switch (opcion){
        case 1: alquilarLibro();
    }
    }
    public static void generarDatos() {
        Autor a1 = new Autor("Josu", LocalDate.of(1999,5,5),"Spain");
        Autor a2 = new Autor("Josemi", LocalDate.of(1999,5,5),"Spain");
        Libro l1 = new Libro("Mis Airpods","josubooks",115,a1);
        Libro l2 = new Libro("Mis Payunes","Gipsyqueens",25,a2);
        libros.add(l1);
        libros.add(l2);
    }
}