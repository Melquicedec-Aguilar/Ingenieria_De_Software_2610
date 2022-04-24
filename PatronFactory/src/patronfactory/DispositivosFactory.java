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
public class DispositivosFactory {
    public static Dispositivos createDispositivos(int tipo) {
        switch (tipo) {
            case Dispositivos.Pavilion_15_EH0001LA:
                return new Computadora("Hp Pavilion", false, false, "8GB", true);
                
            case Dispositivos.Lenovo_IdeaPad:
                return new Computadora("Lenovo", false, false, "8GB", true);
                
            case Dispositivos.Dell_Inspiron:
                return new Computadora("Dell", false, false, "12GB", true);
               
            case Dispositivos.All_in_One_Asus:
                return new Computadora("ASUS", true, true, "8GB", true);
                
            case Dispositivos.OnePlus10_Pro:
                return new Smartphone("One PLus", true, true, "256GB", "12GB");
                
            case Dispositivos.SamsungGalaxy_S22:
                return new Smartphone("Samnsung", true, true, "128 / 256 GB", "8GB");
                
            case Dispositivos.Xiaomi_12:
                return new Smartphone("Xiamoi", true, true, "128 / 256 GB", "8 / 12 GB");
                
            case Dispositivos.RedmiNote_11:
                return new Smartphone("Redmi", false, false, "64 / 128 GB", "4 / 6 GB");
                
            case Dispositivos.Lenovo_Tb_J606L:
                return new Tablet("Lenovo", "4GB", "128GB", 11.0f); 
                
            case Dispositivos.Hytab_Pro:
                return new Tablet("Hyundai", "4GB", "64GB", 10.1f);

            case Dispositivos.Huawei_Matepad_11:
                return new Tablet("Huawei", "6GB", "128GB", 10.95f);
                
            default:
                throw new AssertionError();
        }
    }
}
