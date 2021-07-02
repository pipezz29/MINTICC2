import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

//import jdk.nashorn.internal.scripts.*;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // int num1, num2;
        //Scanner captura = new Scanner(System.in);
        // System.out.println("Introduzca Primer Numero: ");
        // num1=captura.nextInt();
        // System.out.println("Introduzca Segundo Numero: ");
        // num2=captura.nextInt();
        // captura.close();
        // int suma = num1 + num2;
        // System.out.println("La suma es: " +suma);
        //System.err.println("error");

        //final int seg = 0;

        /*String nombre = JOptionPane.showInputDialog(null, "Ingrese Valor");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese Apellido");
        JOptionPane.showMessageDialog(null, "Hola, " +nombre + " " + apellido,"ventana",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showOptionDialog(null, "Desea Continuar", "Seleccione", optionType, messageType, icon, options, initialValue);
        */

        /* select
        String[] carreras ={
            "Ingeniria Sistemas",
            "Ingenieria Alimentos",
            "Decoracion de Interiores",
            "Culinaria"
        };

        //MyIcon ico = new MyIcon();

    String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null,carreras, carreras[0]);       
    */

        int x=5;
        int y = x++;
        int z = x;

        System.out.println(y+" - "+z);
    
    }

}

