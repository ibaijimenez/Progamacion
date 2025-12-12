import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Queue<String> nombreProducto = new LinkedList<>();
    static Queue<String> fechaCaducidad = new LinkedList<>();
    public static void productos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        nombreProducto.add(nombre);
        System.out.print("Fecha del producto: ");
        String fecha = sc.nextLine();
        fechaCaducidad.add(fecha);

    }
    public static void verLista(){
        Scanner sc = new Scanner(System.in);
        System.out.print("==========LISTA==========\n" + nombreProducto + fechaCaducidad);
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
                }
            }
            while (opcion != 4);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}