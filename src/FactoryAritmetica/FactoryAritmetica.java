/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryAritmetica;

import AbstractFactory.AbstractFactory;
import factoryconversion.Conversion;

public class FactoryAritmetica extends AbstractFactory {

    @Override
    public Aritmetica getAritmetica(String tipo) {
        switch(tipo)
        {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
    
    //Aunque este método no lo ocupo acá, debo implementarlo pues esto hereda de abstract factory y como no se ocupa simplemente debe retornar nulo.
    @Override
    public Conversion getConversion(String tipo) {
        return null;
    }

 
}
