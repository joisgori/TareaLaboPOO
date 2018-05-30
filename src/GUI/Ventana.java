/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel; //Libreía para utilizar el texto.
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author josue
 */
public class Ventana extends JPanel {

    public int WIDTH = 600, widthTF = 150, widthB = 50;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3, textF4;
    public JButton buttonS, buttonR, buttonM, buttonD, buttonCb;
    public JLabel resultado, primerN, segundoN, titAritm, titConver; //Para agregar texto
    //public JPanel h;
    
    public Ventana() {
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(70, 20, widthTF, heightTF));

        //Campo de texto donde mostraré la respuesta
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(70, 215, widthTF, heightTF));

        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(70, 60, widthTF, heightTF));

        //Agregué otro campo, donde este funcionará solo para la conversión;        
        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(250, 20, widthTF, heightTF));

        buttonS = new JButton("+");
        buttonS.setBounds(new Rectangle(70, 115, widthB, heightB));

        buttonR = new JButton("-");
        buttonR.setBounds(new Rectangle(125, 115, widthB, heightB));

        buttonM = new JButton("*");
        buttonM.setBounds(new Rectangle(70, 150, widthB, heightB));

        buttonD = new JButton("/");
        buttonD.setBounds(new Rectangle(125, 150, widthB, heightB));

        //Agrego el botón que funcionará para realizar la conversión a binario.
        buttonCb = new JButton("Binario");
        buttonCb.setBounds(new Rectangle(250, 125, 100, heightB));

        //La misma lógica de las cajitas de texto :y 
        resultado = new JLabel("Resultado: ");
        //lblPrueba.setBounds(200, 250, 130, heightB);
        //Es independiente la manera en que se coloquen las coordenadas, ya sea con rectángulo o sin rectángulo
        resultado.setBounds(new Rectangle(20, 185, 78, heightB));
        //----------------------------------------------------------------------
        textF1.setEditable(true);
        textF3.setEditable(true);
        textF4.setEditable(true);
        textF2.setEditable(false);
        
        //Agregar color al fondo:
        //h.setBackground(Color.RED);
        
        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // textF2.setText(textF1.getText());
                AbstractFactory factory = FactoryProducer.getFactory("aritmetico");
                textF2.setText(Integer.toString(factory.getAritmetica("suma").TomarDigitos(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));

            }
        });

        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mando a llamar la abstract factory, instancio un objeto, y le mando el tipo de operación, a su vez, mando que operación
                AbstractFactory factory = FactoryProducer.getFactory("aritmetico");
                //luego de saber qué operación ejecutará (para el caso resta) necesito transformar los dígitos enteros en string con este código.
                textF2.setText(Integer.toString(factory.getAritmetica("resta").TomarDigitos(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }
        });

        buttonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mando a llamar la abstract factory, instancio un objeto, y le mando el tipo de operación (para el caso es de tipo aritmética), a su vez, mando "qué" operación
                //Cabe aclarar que en tipo en la factoryproducer le deje como nombre "aritmetico"
                AbstractFactory factory = FactoryProducer.getFactory("aritmetico");
                //luego de saber qué operación ejecutará (para el caso multiplicación) necesito transformar los dígitos enteros en string con este código.
                textF2.setText(Integer.toString(factory.getAritmetica("multiplicacion").TomarDigitos(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }
        });

        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mando a llamar la abstract factory, instancio un objeto, y le mando el tipo de operación (para el caso es de tipo aritmética), a su vez, mando "qué" operación
                //Cabe aclarar que en tipo en la factoryproducer le deje como nombre "aritmetico"
                AbstractFactory factory = FactoryProducer.getFactory("aritmetico");
                //luego de saber qué operación ejecutará (para el caso división) necesito transformar los dígitos enteros en string con este código.
                //OJO: ACÁ SOLO DEJÉ PARA DIVISIONES ENTERAS, NO HE VALIDADO QUE PUEDA TOMAR FLOTANTES.
                textF2.setText(Integer.toString(factory.getAritmetica("division").TomarDigitos(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }
        });

        buttonCb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mando a llamar la abstract factory, instancio un objeto, y le mando el tipo de operación (para el caso es de tipo conversion), a su vez, mando "qué" operación
                //Cabe aclarar que en tipo en la factoryproducer le deje como nombre "conversion"
                AbstractFactory factory = FactoryProducer.getFactory("conversion");
                //luego de saber qué operación ejecutará (para el caso binario) necesito transformar los dígitos enteros en string con este código.
                //en el factory ya no mando a getarimética, sino a getconversion
                textF2.setText(factory.getConversion("binario").tomarDigito(Integer.parseInt(textF4.getText())));

            }
        });

        add(textF1);
        add(textF3);
        add(buttonS);
        add(buttonR);
        add(buttonM);
        add(buttonD);
        add(buttonCb);
        add(textF2);
        add(textF4);
        add(resultado);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

}
