/*
 * Para iniciar solo se crean los paquetes en solitario y comienzo por las clases puntuales, para este caso, estando en la factory de aritmética, genero las clases:
 * Suma, Resta, Multiplicación y división
 */
package FactoryAritmetica;

/**
 *
 * @author josue
 */
public class Suma implements Aritmetica{

    @Override
    public int TomarDigitos(int a, int b) {
        return a + b;
    } //Como bien podría crear una tercera variable, también puedo retornar directamente el entero del suma de ambos para ahorrar líneas de código.
    
}
