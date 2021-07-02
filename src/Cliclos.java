import java.util.Scanner;

public class Cliclos {
    
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite cuantos datos desea imprimir");
        int contador = entrada.nextInt();
        int i=1;
        while (i <= contador) {
            System.out.println(i);
            i++;
            
        }

    }
}
