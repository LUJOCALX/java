import java.util.Scanner; 

public class Uri1065{
   
    public static void main(String args[]){
      
       Scanner teclado = new Scanner(System.in);
       
       int numero;
       int qtdPares = 0;

       for(int cont=1; cont <= 5; cont++){
        
        numero = teclado.nextFloat();
           if (numero %2== 0){
           qtdPares++  ;
         }
       }
      
                  
      System.out.println(qtde+ " valores positivos");
      System.out.printf("%.1f\n", media);

    }

}
