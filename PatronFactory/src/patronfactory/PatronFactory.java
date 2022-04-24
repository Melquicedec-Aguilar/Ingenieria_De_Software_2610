/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

import java.util.Scanner;

/**
 *
 * @author melqui
 */
public class PatronFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿De cuál dispositivo gusta las especificaciones?");
        System.out.println(Dispositivos.Pavilion_15_EH0001LA + ") Computadora Pavilion");
        System.out.println(Dispositivos.Lenovo_IdeaPad + ") Computadora Lenovo");
        System.out.println(Dispositivos.Dell_Inspiron + ") Computadora Dell");
        System.out.println(Dispositivos.All_in_One_Asus + ") Computadora Asus");
        System.out.println(Dispositivos.OnePlus10_Pro + ") Celular One Plus 10 Pro");
        System.out.println(Dispositivos.SamsungGalaxy_S22 + ") Celular Samsung Galaxy S22");
        System.out.println(Dispositivos.Xiaomi_12 + ") Celular Xiaomi 12");
        System.out.println(Dispositivos.RedmiNote_11 + ") Celular Redmi Note 11");
        System.out.println(Dispositivos.Lenovo_Tb_J606L + ") Tableta Lenovo Tb J606L");
        System.out.println(Dispositivos.Hytab_Pro + ") Tableta Hytab Pro");
        System.out.println(Dispositivos.Huawei_Matepad_11 + ") Tableta Huawei");
        
        try {
            System.out.print("Elige el número: ");
            eleccion = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("No ingresaste un número");
        }
        
        Dispositivos aparatos = DispositivosFactory.createDispositivos(eleccion);
        System.out.println(aparatos.toString());
    }
    
}
