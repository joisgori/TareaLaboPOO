/*
 * Tercer paso será el abstractfactory, obersvar como se utiliza el public abstract class...
 * creo un método public abstrac de tipo artimética con nombre getArtimética que recibirá como parámetro un tipo, para indicar qué clase será la que se pondrá en marcha...
 * esto se mandará a FactoryAritmetica donde se generá un switch para escoger el tipo.
 */
package AbstractFactory;

import FactoryAritmetica.Aritmetica;
import factoryconversion.Conversion;

/**
 *
 * @author josue
 */
public abstract class AbstractFactory {
    public abstract Aritmetica getAritmetica(String tipo);
    
    //Para la otra factory, en este casi conversion, creo un nuevo método...
    public abstract Conversion getConversion(String tipo);
}
