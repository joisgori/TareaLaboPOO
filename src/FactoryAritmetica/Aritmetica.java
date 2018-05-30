/*
 * Como segundo paso, o segunda clase de java a crear será la clase aritmética, esta será implementada por Suma, Resta, Multiplicación y División...
 * Acá en aritmética estará el método a compartir, para el caso es TomarDigitos, pues todo el resto de clases necesitarán recibir ambos números.
 */
package FactoryAritmetica;

/**
 *
 * @author josue
 */
public interface Aritmetica {
    public int TomarDigitos(int a, int b); //Creo el método en común y le coloco los argumentos con los que trabajará...
}
