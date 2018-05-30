/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryconversion;

import AbstractFactory.AbstractFactory;
import FactoryAritmetica.Aritmetica;

/**
 *
 * @author josue
 */
public class FactoryConversion extends AbstractFactory {

    @Override
    public Aritmetica getAritmetica(String tipo) {
        return null; //pues este no lo ocuparé acá
    }

    //y este sí debo implementarlo de manera correcta, crearé el switch
    @Override
    public Conversion getConversion(String tipo) {
        switch (tipo){
            case "binario":
                return new Binario(); //estoy retornando un nuevo objeto.
            case "hexadecimal":
                return new Hexadecimal();
        }
        return null; //y agrego el nulo en caso de que no sea ninguno de estos.
    }
    
    
}
