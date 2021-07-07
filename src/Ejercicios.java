import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;


public class Ejercicios {
    

    public static void main(String[] args) {
        

        /*
        Ejercicio 1:
        Realizar la suma, la resta, la división y la multiplicación de dos números
        leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
        y  <número 2> es igual a <resultado> ”.
        */

                

        boolean canContinue = false;
        int num1 = 0; int num2 = 0;
 
        do {
            String numero1 = JOptionPane.showInputDialog(null, "Ingrese Primer Numero: ", 0);
            String numero2 = JOptionPane.showInputDialog(null, "Ingrese Segundo Numero: ", 0);
  
            try {
                num1 = Integer.parseInt(numero1);
                num2 = Integer.parseInt(numero2);
                canContinue = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero válido", "Error", JOptionPane.ERROR_MESSAGE);
                canContinue = false;
            }
        } while (!canContinue);
        
    
        int sum = new Operaciones().suma(num1, num2);
        int resta = new Operaciones().resta(num1, num2);
        int producto = new Operaciones().producto(num1, num2);
        Double division = new Operaciones().division(num1, num2);


        JOptionPane.showMessageDialog(null, "La Suma de "+num1+" y "+num2+ " es igual a "+sum+"\n"+
        "La Resta de "+num1+" y "+num2+ " es igual a "+resta+"\n"+
        "El producto de "+num1+" y "+num2+ " es igual a "+producto+"\n"+
        "La division de "+num1+" y "+num2+ " es igual a "+division, "Operaciones", JOptionPane.INFORMATION_MESSAGE);
        
        
    
    

 
        
        
    }
}
