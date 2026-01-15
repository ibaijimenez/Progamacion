import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean correcto = false;
    private static  String[] meses ={"enero" , "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private static Map<String,Map<Integer,Double>> gastos;
   static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   public static boolean validarMes(String mes){
       for(int i=0;i<meses.length;i++){
           if(mes.equals(meses[i])){
               correcto = true;
               return correcto;
           }
       }
       return correcto;
   }

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print("Ingrese la mes: ");
                String mes = sc.nextLine().toUpperCase();
                validarMes(mes);
            }
            while(!correcto == true);

                System.out.print("Ingrese la dia: ");
                String dia = sc.nextLine();

            }
        while(true);

    }
}