/*
 * 3er clase que creo que luego de implementar artimética se coloca en el factory arimética para el caso multiplicación.
 */
package FactoryAritmetica;

/**
 *
 * @author josue
 */
public class Multiplicacion implements Aritmetica {

    @Override
    public int TomarDigitos(int a, int b) {
        return a * b; 
    }
    
}
