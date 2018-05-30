/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import javax.swing.JFrame;

/**
 *
 * @author josue
 */
public class Principal {
    public static void main(String[] args) {
            //AbstractFactory bla = FactoryProducer.getFactory("aritmetico");
            //System.out.println(bla.getAritmetica("suma").TomarDigitos(5, 3));
        //Integer.parseInt(caja.getText()),Integer.parseInt(caja2.getText())
            //int v = bla.getAritmetica("suma").TomarDigitos(5, 3);
        //resultado.setText(Integer.toString(v))
        JFrame ventana = new JFrame("CALCULADORA");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
    }
    
}
