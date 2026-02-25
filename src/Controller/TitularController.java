package Controller;

import Dao.TitularDao;
import Modelo.Titular;

public class TitularController {
    private static TitularDao titularDao = new TitularDao();
    public static void crearTitular(String nombre, String dni) {
        Titular titular = new Titular(nombre, dni);
        TitularDao.añadirTitular(titular.getNombre(),  titular.getDni());
    }
    public static void editarTitular(String nombre) {

    }

    public static String buscarTitular(String nombre) {
        Titular titular = new Titular(nombre);
        String select1= titularDao.buscarTitular(titular.getNombre());
        return select1;
    }
}
