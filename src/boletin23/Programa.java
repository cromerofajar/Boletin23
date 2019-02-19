package boletin23;

import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Programa {
    public void añadirPersonasAFila(Queue<Cola> col,int numeroP) throws ForaDeRangoExcepcion{
        if(numeroP<=50&& numeroP>0){
            for(int i=0;i<=numeroP-1;i++){
                int edad=(int)(Math.random()*50)+5; 
                Cola perso=new Cola(edad);
                col.add(perso);
            }
        }
        else{
            if (numeroP<=0){
                throw new ForaDeRangoExcepcion("No puede tener 0 o menos personas en la fila");
            }
            else{
                throw new ForaDeRangoExcepcion("No puede tener mas de 50 personas en la fila");
            }
        }
    }
    public double venderEntrada(Queue<Cola>col, double ganancias) throws ForaDeRangoExcepcion{
        if(col.size()<=0){
            throw new ForaDeRangoExcepcion("No queda a quien vender entradas");
        }
        else{
            for(Cola edad: col){
                if(edad.getEdad()>=5 && edad.getEdad()<=10){
                    ganancias=ganancias+1;
                }
                else if(edad.getEdad()>=11 && edad.getEdad()<=17){
                    ganancias=ganancias+2.5;
                }
                else if(edad.getEdad()>=18){
                    ganancias=ganancias+3.5;
                }
            }
        }
        col.removeAll(col);
        return ganancias;
    }
    public void totalGanancias(double ganancias){
        JOptionPane.showMessageDialog(null,"Las ganancais totales son: "+ganancias);
        System.exit(0);
    }
}
