/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import FactoryAritmetica.FactoryAritmetica;
import factoryconversion.FactoryConversion;

/**
 *
 * @author josue
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo)
        {
            case "aritmetico":
                return new FactoryAritmetica(); //retorno un nuevo objeto factory aritmética
            case "conversion":
                return new FactoryConversion(); //retorno un nuevo objeto factory conversión.
        }
        return null;
    }
    
}
