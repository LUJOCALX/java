import java.util.Scanner; 

public class Uri1074{
   
    public static void main(String args[])
    {
      
       Scanner teclado = new Scanner(System.in);
       int qtde;
       double numero,valor;
       
       qtde = teclado.nextInt();
      
for(int cont=1;cont<=qtde;cont++){

       numero = teclado.nextDouble();
      if (qtde<=10000)
      {
          if (numero <0 && numero %2 == 0){
          System.out.println("EVEN NEGATIVE");}
          if (numero >0 && numero %2 == 0){
          System.out.println("EVEN POSITIVE");}  
          if (numero >0 && numero %2 != 0){
          System.out.println("ODD POSITIVE");}   
          if (numero <0 && numero %2 != 0){
          System.out.println("ODD NEGATIVE");} 
          if (numero == 0){
          System.out.println("NULL");}     
               
      }
     }
     }
      
   }
