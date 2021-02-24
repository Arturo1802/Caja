/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectocaja;


public class Caja {
    private double largo;
    private double ancho;
    private double alto;

    public Caja(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Caja() {
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calculaVolumen(){
        return alto*ancho*largo; 
    }
    @Override 
    public String toString(){
     return "Largo: "+  largo+", Ancho: "+ ancho+", Alto: "+ alto;
    }
    
}
