import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero"));

        if (numero== dato){
            JOptionPane.showMessageDialog(null, "El numero es igual a 5", "Condicionales", JOptionPane.INFORMATION_MESSAGE);
        }



    }
    
}
