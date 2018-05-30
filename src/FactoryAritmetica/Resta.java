/*
 * Este fue mi segundo caso, que por supuesto luego de implementar lo de aritmética y crear su método abstracto lo coloco en la factory arimética creando
 * para el caso de resta.
 */
package FactoryAritmetica;

/**
 *
 * @author josue
 */
public class Resta implements Aritmetica {

    @Override
    public int TomarDigitos(int a, int b) {
        return a - b;
    }
    
    
}
