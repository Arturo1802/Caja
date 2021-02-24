 
package proyectocaja;
 
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class ProyectoCaja {
 
    public static void main(String[] args) { 
        Caja caja1 =new Caja();
        Caja caja2 =new Caja(5,3,8);
        
        
         
        caja1.setLargo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo de la caja 1"))); 
        caja1.setAncho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la caja 1"))); 
        caja1.setAlto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto de la caja 1")));
        
        
        JOptionPane.showMessageDialog(null, "El volumen de la caja 1 es: "+caja1.calculaVolumen());
        JOptionPane.showMessageDialog(null, "Las medidas son: "+caja1.toString());
        JOptionPane.showMessageDialog(null, "El volumen de la caja 2 es: "+caja2.calculaVolumen());
        JOptionPane.showMessageDialog(null, "Las medidas son: "+caja2.toString());
             
        
        if (caja1.calculaVolumen()<caja2.calculaVolumen()) {
            JOptionPane.showMessageDialog(null,  "❤❤❤❤La caja 2 es mas grande que la caja 1❤❤❤❤");
        
        } else {
            if (caja1.calculaVolumen()>caja2.calculaVolumen()) {
                JOptionPane.showMessageDialog(null,  "❤❤❤❤La caja 1 es mas grande que la caja 2❤❤❤❤");
            }else{
                JOptionPane.showMessageDialog(null, "❤❤❤❤Tienen la misma capacidad❤❤❤❤" ); 
            }
        }
    }
    
}
