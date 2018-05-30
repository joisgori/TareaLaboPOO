/*
 * Última clase de aritmética que creo, que implementará aritmética y por supuesto debo crear su caso en factory aritmética...
 */
package FactoryAritmetica;

/**
 *
 * @author josue
 */
public class Division implements Aritmetica {

    @Override
    public int TomarDigitos(int a, int b) {
        return a / b;
    }

}
