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
public class Computadora implements Dispositivos{
    private String marca;
    private boolean escritorio;
    private boolean entradaRj45;
    private String RAM;
    private boolean tarjetaGraficaIntegrada;

    public Computadora() {
    }

    public Computadora(String marca, boolean escritorio, boolean entradaRj45, String RAM, boolean tarjetaGraficaIntegrada) {
        this.marca = marca;
        this.escritorio = escritorio;
        this.entradaRj45 = entradaRj45;
        this.RAM = RAM;
        this.tarjetaGraficaIntegrada = tarjetaGraficaIntegrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEscritorio() {
        return escritorio;
    }

    public void setEscritorio(boolean escritorio) {
        this.escritorio = escritorio;
    }

    public boolean isEntradaRj45() {
        return entradaRj45;
    }

    public void setEntradaRj45(boolean entradaRj45) {
        this.entradaRj45 = entradaRj45;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean isTarjetaGraficaIntegrada() {
        return tarjetaGraficaIntegrada;
    }

    public void setTarjetaGraficaIntegrada(boolean tarjetaGraficaIntegrada) {
        this.tarjetaGraficaIntegrada = tarjetaGraficaIntegrada;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", escritorio=" + escritorio + ", entradaRj45=" + entradaRj45 + ", RAM=" + RAM + ", tarjetaGraficaIntegrada=" + tarjetaGraficaIntegrada + '}';
    }    
}
