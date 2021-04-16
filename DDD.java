import java.util.Scanner; 

public class DDD{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
                        
       double DDD;
       DDD = teclado.nextInt();
       
       if (DDD == 61||DDD == 71||DDD == 11||DDD == 21||DDD == 32||DDD == 19||DDD == 27||DDD == 31)
    {
       if (DDD == 61){System.out.println("Brasilia");}
       if (DDD == 71){System.out.println("Salvador");}
       if (DDD == 11){System.out.println("Sao Paulo");}
       if (DDD == 21){System.out.println("Rio de Janeiro");}
       if (DDD == 32){System.out.println("Juiz de Fora");}
       if (DDD == 19){System.out.println("Campinas");}
       if (DDD == 27){System.out.println("Vitoria");}
       if (DDD == 31){System.out.println("Belo Horizonte");}
    }  
      else System.out.println("DDD nao cadastrado");
    }
}