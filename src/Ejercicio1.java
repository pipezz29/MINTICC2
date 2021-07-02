import java.util.Scanner;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;
import jdk.vm.ci.meta.Value;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        

        float nota1, nota2, nota3;


        //Scanner entrada = new Scanner(System.in);
        //System.out.println("Digite las 3 Notas");
        JOptionPane.showMessageDialog(null, "Ingrese las 3 Notas", "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
        //nota1 = entrada.nextFloat();
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1"));
        //nota2 = entrada.nextFloat();
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1"));
        //nota3 = entrada.nextFloat();
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1"));
        //entrada.close();

        float suma = nota1 + nota2 + nota3;

        //System.out.println("\n La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La Suma es: " + suma, "Ejercicio 1", JOptionPane.OK_CANCEL_OPTION);
    }
}
