import java.util.Scanner;

import javax.script.ScriptEngineManager;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) throws Exception{
        
        var entrada = new Scanner(System.in);

        float guillermo, luis, juan, total;

        System.out.println("Digite cantidad de dinero de Guillermo");

        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        juan = (guillermo+luis) / 2;
        total = guillermo + juan + luis;

        System.out.println("La cantidad de dinero que hay entre los 3 es: " + total);




    }
}
