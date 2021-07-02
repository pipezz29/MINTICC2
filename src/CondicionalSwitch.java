import javax.swing.JOptionPane;

public class CondicionalSwitch {
    
    public static void main(String[] args) {
        
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero 1 al 5"));

        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "El Numero es 1", "Switch", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El Numero es 2", "Switch", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El Numero es 3", "Switch", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El Numero es 4", "Switch", JOptionPane.INFORMATION_MESSAGE);
                break;    
            default:
            JOptionPane.showMessageDialog(null, "El Numero no esta en el Rango", "Switch", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    
    
    
    }

}
