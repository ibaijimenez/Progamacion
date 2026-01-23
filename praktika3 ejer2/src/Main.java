import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList <Veterinarios> veterinarios = new ArrayList();
    public static ArrayList <Perro> perros = new ArrayList();
    public static ArrayList <Gato> gatos = new ArrayList();
    public static ArrayList <Cliente> clientes = new ArrayList();
    public static void main(String[] args) {

        solicitardatos();
    Scanner sc = new Scanner(System.in);
    System.out.println("=== MENU ===\n" +
            "0.- Introducir datos\n" +
            "1.- Mostrar el numero de clientes que poseen un tipo de animal concreto \n" +
            "2.- Datos personales del cliente a partir del nombre de mascota Suponemos que es unico.\n" +
            "3.- Datos del veterinario a partir de los datos de una mascota.\n" +
            "4.- Datos de las mascotas de un cliente.\n" +
            "5.- Datos de las mascotas de un veterinario. \n" +
            "6.- Terminar." );
    int opcion = sc.nextInt();
    switch (opcion) {
        case 1:
            mostrarclientesqueposeenanimales();
    }

    }
    public static void solicitardatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Registrar Veterinario");
        System.out.println("2. añadir Veterinario a tu mascota ");
        System.out.println("3. Registrar Cliente y Mascota");
        System.out.println("5. Salir");
        System.out.print("¿Qué quieres hacer?: ");
        int respuesta =  sc.nextInt();
        switch (respuesta) {
            case 1:
                    System.out.println("Ingresa el nombre del veterinario");
                    String nombreV = sc.nextLine();
                    System.out.println("Ingresa la direccion del veterinario");
                    String direccionV = sc.nextLine();
                    System.out.println("Ingresa el telefono del veterinario");
                    String telefonoV = sc.nextLine();
                    System.out.println("Ingresa la dni del veterinario");
                    String dniV = sc.nextLine();
                    System.out.println("Ingresa el numero de SS del veterinario");
                    String num_ssV = sc.nextLine();
                    Veterinarios v1 = new Veterinarios(nombreV, direccionV, telefonoV, dniV, num_ssV);
                    veterinarios.add(v1);
                    System.out.println("Veterinario" + v1.getNombre() + " creado correctamente");
                    break;
                    case 2:
                        System.out.println("Ingresa el nombre del veterinario que quieres asignar a la mascota");
                        String nombreVM = sc.nextLine();
                        for(int i = 0; i < veterinarios.size(); i++) {
                            if(veterinarios.get(i).getNombre().equals(nombreVM)) {
                                System.out.println("tu mascota es perro?");
                                String mascotaVM = sc.nextLine();
                                if (mascotaVM == "si") {
                                    for (int p = 0;p < perros.size();p++) {
                                        System.out.println("Como se llama?");
                                        String perroVM = sc.nextLine();
                                        if (perros.get(i).getNombre().equals(perroVM)) {
                                            Veterinarios
                                        }
                                    }
                                }
                            }
                        }

                        break;
                        case 3:
                            System.out.println("Ingresa el nombre del cliente");
                            String nombreC = sc.nextLine();
                            System.out.println("Ingresa la direccion del cliente");
                            String direccionC = sc.nextLine();
                            System.out.println("Ingresa el telefono del cliente");
                            String telefonoC = sc.nextLine();
                            System.out.println("Ingresa la raza de la mascota");
                            String razaMC = sc.nextLine();
                            System.out.println("Ingresa el nombre de la mascota");
                            String nombreMC = sc.nextLine();
                            System.out.println("Ingresa fecha de nacimiento de la mascota");
                            String fechaMC = sc.nextLine();
                            System.out.println("Ingresa el sexo de la mascota");
                            String sexoMC = sc.nextLine();
                            System.out.println("Ingresa el peso de la mascota");
                            String pesoMC = sc.nextLine();
                            System.out.println("Ingresa la longitud de la mascota");
                            String longitudMC = sc.nextLine();
                            System.out.println("tu mascota es un perro?");
                            String perroMC = sc.nextLine();
                            if (perroMC == "si") {
                                Perro p1 = new Perro(razaMC,nombreMC,fechaMC,sexoMC,pesoMC,longitudMC);
                                perros.add(p1);
                                Cliente c1 = new Cliente(nombreC,direccionC,telefonoC,p1);
                                clientes.add(c1);
                            }
                            else{
                                Gato g1 = new Gato(razaMC,nombreMC,fechaMC,sexoMC,pesoMC,longitudMC);
                                gatos.add(g1);
                                Cliente c1 = new Cliente(nombreC,direccionC,telefonoC,g1);
                                clientes.add(c1);
                            }
                            break;


        }
    }
    public static void mostrarclientesqueposeenanimales(){

    }
}