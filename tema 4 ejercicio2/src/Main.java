import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Empleado e1 = new Empleado("Josemi",18,1900);
    Directivo d1 = new Directivo("Josu",18,2100,"1");
    Empleado e2 = new Empleado("Urtzi",18,1900);
    Cliente c1 = new Cliente("Jonbu",18,"C4C4");
    Cliente c2 = new Cliente("Unai",20,"3CEP");
    Cliente c3 = new Cliente("Aritz",18,"1111");
    Empleado e3 = new Empleado("Fatima",19,1900);
    Empleado e4 = new Empleado("Josulin",19,1900);
    Directivo d2 = new Directivo("ibai",19,2100,"2");
    Empleado e5 = new Empleado("Pablo",19,1900);
    List<Empleado> listaEmpleados1 = new ArrayList<>();
    listaEmpleados1.add(e1);
    listaEmpleados1.add(e2);
    listaEmpleados1.add(e5);
    listaEmpleados1.add(d2);
    List<Cliente> listaClientes1 = new ArrayList<>();
    listaClientes1.add(c1);
    listaClientes1.add(c2);

        List<Empleado> listaEmpleados2 = new ArrayList<>();
        listaEmpleados1.add(e3);
        listaEmpleados1.add(e4);
        listaEmpleados1.add(d1);
        List<Cliente> listaClientes2 = new ArrayList<>();
        listaClientes2.add(c3);
    Empresa Zaramaga = new Empresa("Zaramaga",listaEmpleados1,listaClientes1);
    Empresa AgutinSistem = new Empresa("Agutin System",listaEmpleados2,listaClientes2);
        directivoMasSub();
    }
    public static void directivoMasSub() {

    }
}