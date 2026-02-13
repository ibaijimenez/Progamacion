import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static List<Coche> coches = new ArrayList<>();
    public static List<Propietario> propietarios = new ArrayList<>();
    public static void generarDatos(){
        // COCHES
        Coche c1 = new Coche("1234 ABC", "Toyota", 2018 , 18000);
        Coche c2 = new Coche("5678 DEF", "BMW", 2015 , 25000);
        Coche c3 = new Coche("9012 GHI", "Seat", 2012 , 12000);
        Coche c4 = new Coche("3456 JKL", "Toyota", 2020 , 22000);
        Coche c5 = new Coche("7890 MNO", "Audi", 2017 , 30000);
        Coche c6 = new Coche("1122 PQR", "BMW", 2010 , 15000);
        Coche c7 = new Coche("3344 STU", "Seat", 2019 , 16000);
        Coche c8 = new Coche("5566 VWX", "Audi", 2014 , 20000);
        Coche c9 = new Coche("7788 YZA", "Toyota", 2021 , 24000);

        // PROPIETARIOS
        Propietario p1 = new Propietario (
                "Carlos",
                List.of(c1 , c2 , c3)
        );


        Propietario p2 = new Propietario (
                "Ana",
                List.of(c4 , c5 , c6)
        );

        Propietario p3 = new Propietario (
                "Luis",
                List.of(c7 , c8 , c9)
        );

    }
    public static void main(String[] args) {
     generarDatos();
     obtenerMatriculas();

    }
    public static void obtenerMatriculas(){

      /*  ArrayList<Propietario> propietarios = new ArrayList<>();
        List <String> matriculas = new ArrayList<>();
        for (int i = 0; i < propietarios.size(); i++) {
            Propietario p = propietarios.get(i);
            for (int j = 0; j < p.getCoches().size(); j++) {
                Coche c = p.getCoches().get(j);
                matriculas.add(c.getMatricula());
            }
        }
        System.out.println(matriculas);
        */
        ArrayList <Propietario> propietarios = new ArrayList <>();

        List <String> matriculas = propietarios.stream()
                .flatMap(p -> p.getCoches().stream())
                .map(Coche :: getMatricula)
                .collect(Collectors.toList());
        matriculas.forEach(System.out::println);
    }
}