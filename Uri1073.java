import java.util.Scanner; 

public class Uri1073{
   
    public static void main(String args[])
    {
      
       Scanner teclado = new Scanner(System.in);
       
       int numero,valor;
       numero = teclado.nextInt();
      

      if (numero >=5 && numero <=2000)
      {

            for(int qde=2; qde<=numero; qde+=2)
            {
        //
            // System.out.println(qde+ " " + qde*qde+ " " +qde*qde*qde); 
          System.out.println(qde+ "^2 = " +qde*qde); 
         }

     }
      
                         
    }

}