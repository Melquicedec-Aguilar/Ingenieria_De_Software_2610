/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

/**
 *
 * @author melqui
 */
public class Tablet implements Dispositivos{
    private String marca;
    private String memoriaRam;
    private String almacenamiento;
    private float pulgadas;

    public Tablet() {
    }

    public Tablet(String marca, String memoriaRam, String almacenamiento, float pulgadas) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", pulgadas=" + pulgadas + '}';
    }
}
