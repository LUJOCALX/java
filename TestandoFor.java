import java.util.Scanner; 

public class TestandoFor{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       
       int valor;

       for (valor = 1; valor <=100; valor=valor%2){
          
           System.out.println("Valor = "+valor);
      
       };

    }

}