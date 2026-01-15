import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudio e = new Estudio("Universal");
        Estudio e2 = new Estudio("Nikelodeon");
        Estudio e3 = new Estudio("Galaxia");
        ArrayList<Estudio> lista = new ArrayList<>();
        lista.add(e);
        lista.add(e2);
        lista.add(e3);



        String respuesta;
        String pelicula;
        String año;
        String duracion;
        String tipo;

        int duracion;
        List<Estudio> lista1 = new ArrayList<>();

            System.out.println("Introduce el nombre de la pelicula: ");
            pelicula = sc.nextLine();

            System.out.println("Introduce el año de la pelicula: ");
            año = sc.nextLine();

            System.out.println("Introduce la duracion de la pelicula: ");
            duracion = sc.nextInt();

            System.out.println("Introduce el tipo de la pelicula: ");
            tipo = sc.nextLine();
        do {
            System.out.println("que estudios han producido" + Pelicula.);
            respuesta = sc.nextLine();
            for (Estudio est : lista) {
                if (est.getNombre().equalsIgnoreCase(respuesta)) {
                    System.out.println(est + "ha producido piratas");
                    lista1.add(est);
                }

            }
        }
        while (!respuesta.isEmpty());
        Pelicula p = new Pelicula(pelicula,año,duracion,tipo,lista1);




        Pelicula p = new Pelicula("hora de aventuras","1990",120,"aventura",lista1);
        }

    }
