import java.util.Scanner; 

public class Uri1070{
   
    public static void main(String args[]){
      
       Scanner teclado = new Scanner(System.in);
       
       int numero;
       numero = teclado.nextInt();
      
      
      for(int qtd=1; qtd<=6; ){
       
        if (numero %2 !=0){
        System.out.println(numero); 
        qtd++;}

        //System.out.println(cont+" contador");
        //System.out.println(numero+" Numero");  
        //System.out.println((numero%2)+" Numero%%2");
        numero++;
        
        //System.out.println(numero+" Numero + 1" ); 
       
                   
    }

}
}