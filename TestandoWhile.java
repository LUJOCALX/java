import java.util.Scanner; 

public class TestandoWhile{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       
       int valor = 1;

       while (valor <= 10){
          
           System.out.println("Valor = "+valor);

            valor = valor + 1;
       }

    }

}