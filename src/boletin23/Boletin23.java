package boletin23;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author cromerofajar
 */
public class Boletin23 {

    public static void main(String[] args) {
        Queue<Cola> col= new LinkedList<>();
        double ganancias=0;
        Programa obx=new Programa();
        int numeroP=PedirDatos.entero("Introduzca personas a añadir");
        try{
                obx.añadirPersonasAFila(col, numeroP);
                ganancias=obx.venderEntrada(col, ganancias);
                obx.totalGanancias(ganancias);
        }
        catch(ForaDeRangoExcepcion e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

