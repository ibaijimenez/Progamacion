import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String [] especies={"perro","gato","conejo","loro","tortuga"};
    static List <String> animalesAceptados=new ArrayList();
    public static void verEspecies(){
        List <String> listaEspecies=Arrays.asList(especies);
        System.out.print("Especies aceptadas: " + listaEspecies);
    }
    public static void aceptarAnimales(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la especie de tu mascota: ");
            String especie = sc.nextLine();
            List<String> aceptarAnimales = Arrays.asList(especies);
            if (aceptarAnimales.contains(especie)) {
                System.out.println("Introduce el nombre de la mascota: ");
                String nombre = sc.nextLine();
                animalesAceptados.add(nombre);
                System.out.println("Mascotas: " + animalesAceptados);
            }
            else {
                throw new Exception("La especie no ha sido aceptada");
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("a) Ver especies aceptadas.\n" +
                        "b) Agregar un nuevo animal al listado de rescatados.\n" +
                        "c) Asignar un cuidador a un animal.\n" +
                        "d) Pasar un animal a la cola de espera de adopcion. ´\n" +
                        "e) Adoptar un animal.\n" +
                        "f) Lista todos los animales y sus cuidadores actuales.\n" +
                        "g) Salir\n");
                String opcion = sc.nextLine();
                switch (opcion) {
                    case "a":
                        verEspecies();
                        break;
                        case "b":
                            aceptarAnimales();
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);

    }
}