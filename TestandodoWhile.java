import java.util.Scanner; 

public class TestandodoWhile{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       
       int valor = 100;

       do{
          
           System.out.println("Valor = "+valor);
            valor = valor + 1;
      
       } while (valor <= 10);

    }

}