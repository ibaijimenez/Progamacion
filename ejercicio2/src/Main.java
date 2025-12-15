import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static Queue<String> nombreProducto = new LinkedList<>();
    static Queue<String> fechaCaducidad = new LinkedList<>();
    public static void productos(){
        boolean w = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();
                nombreProducto.add(nombre);
                System.out.print("Fecha del producto(dd/MM/yyyy): ");
                String fecha = sc.nextLine();
                LocalDate fechaObjeto = LocalDate.parse(fecha, dtf);
                fechaCaducidad.add(String.valueOf(fechaObjeto));
                w = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (!w);
    }
    public static void verLista(){
        Scanner sc = new Scanner(System.in);
        System.out.print("==========LISTA==========\n" + nombreProducto + fechaCaducidad);
    }
    public static void introducirFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la fecha de hoy: ");
        String fechahoy = sc.nextLine();
        LocalDate fechaObjeto = LocalDate.parse(fechahoy, dtf);
        for (int i = 0; i<fechaCaducidad.size();i++){
            if (fechaObjeto.isBefore(fechaObjeto)){
                fechaCaducidad.remove(i);
                nombreProducto.remove(i);
            }
        }

    }

    public static void main(String[] args) {
        try {
            int opcion;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.print("==============MENU==============\n" +
                        "1.- Introducir producto\n" +
                        "2.- Ver lista\n" +
                        "3.-Introducir fecha" +
                        "4.-salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        productos();
                        break;
                    case 2:
                        verLista();
                        break;
                    case 3:
                        introducirFecha();
                        break;
                }
            }
            while (opcion != 4);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}