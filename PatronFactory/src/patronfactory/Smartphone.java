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
public class Smartphone implements Dispositivos{
    private String marca;
    private boolean gamaAlta;
    private boolean resistenteAlAgua;
    private String almacenamiento;
    private String RAM;

    public Smartphone() {
    }

    public Smartphone(String marca, boolean gamaAlta, boolean resistenteAlAgua, String almacenamiento, String RAM) {
        this.marca = marca;
        this.gamaAlta = gamaAlta;
        this.resistenteAlAgua = resistenteAlAgua;
        this.almacenamiento = almacenamiento;
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGamaAlta() {
        return gamaAlta;
    }

    public void setGamaAlta(boolean gamaAlta) {
        this.gamaAlta = gamaAlta;
    }

    public boolean isResistenteAlAgua() {
        return resistenteAlAgua;
    }

    public void setResistenteAlAgua(boolean resistenteAlAgua) {
        this.resistenteAlAgua = resistenteAlAgua;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", gamaAlta=" + gamaAlta + ", resistenteAlAgua=" + resistenteAlAgua + ", almacenamiento=" + almacenamiento + ", RAM=" + RAM + '}';
    }
    
    
}
