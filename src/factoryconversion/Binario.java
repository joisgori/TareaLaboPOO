/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryconversion;

/**
 *
 * @author josue
 */
public class Binario implements Conversion {

    @Override
    public String tomarDigito(int a) {
        //hplo
        String bin = "", CadenaSalida=""; //Creo una cadena de salida donde se invertirá mi número binario almacenado, para mostrarlo correctamente
        int temp = 0;

        while (a >= 2) {
            temp = a % 2;
            a = a / 2;
            bin = bin + temp;

        }
        
        bin = bin + a;
        
        for(int i = bin.length()-1; i>=0; i--){
            CadenaSalida = CadenaSalida + Character.toString(bin.charAt(i));
        }
        
        

        return CadenaSalida;
    }

}
