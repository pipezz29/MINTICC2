import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    /*
        Realizar un programa que realice el promedio de las notas de un alumno,
        para ello el programa va a tener que solicitar el nombre del alumno y las
        notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
        3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
        “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
        decimales
    */

    public static void main(String[] args) {
        
            DecimalFormat formato1 = new DecimalFormat("#.00");
            
                String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre Estudiante");
                int cantNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantas notas", JOptionPane.WARNING_MESSAGE));
                float[] vector = new float[cantNotas];
                // Llamamos a los metodos
                llenarVector( vector );
                //mostrarVector( vector );
                float prom= promedio(vector);
                if (prom>=3){
                    JOptionPane.showMessageDialog(null, "El estudiante "+nombre+" Aprobó\n con promedio: "+ formato1.format(prom), "Notas", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "El estudiante "+nombre+" Reprobó\n con promedio: "+formato1.format(prom), "Notas", JOptionPane.INFORMATION_MESSAGE);
                }



    }

    public static void llenarVector( float[] vector )
    {
            String dato;
            float numero;

            for( int i = 0; i < vector.length; i ++ )
            {
                // Leer datos del usuario, el dato ingresado se almacena en un String
                
                dato = JOptionPane.showInputDialog( "Ingrese dato Nro "+ ( i + 1 ) );

                // Convertimos el dato ingresado  en un int
                numero = Float.parseFloat(dato);

                // Guardamos el dato ingresado en el vector
                vector[ i ] = numero;
            }

    }

    public static void mostrarVector( double[] vector )
    {
            // Recorremos cada posicion del vector y lo mostramos por consola
            //for( int i = 0; i < vector.length; i ++ )
                //JOptionPane.showMessageDialog(null, "  " + vector[ i ] );    
                //System.out.print( "  " + vector[ i ] );
                JOptionPane.showMessageDialog(null,"Notas: "+ Arrays.toString(vector));
                

    }

    public static float promedio(float[] arr) 
    {
        // obtener suma de valores del array
        float suma = 0;
        float promedio;
         
        for (int i = 0; i < arr.length; i++)
            suma += arr[i];
            
        promedio = suma / arr.length;
        
        //System.out.println("suma "+suma+" promedio "+promedio);
        return promedio;
        
        
    }
}
