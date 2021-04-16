import java.util.Scanner; 

public class Uri1019{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
                        
       int tempoTotal,hr,min,seg;
       
       tempoTotal = teclado.nextInt();
       hr= (tempoTotal/(60*60));
       min=((tempoTotal - (hr*60*60))/60);
       seg= (tempoTotal - (hr*60*60) - (min * 60));
       System.out.printf("%d:%d:%d\n",hr,min,seg);

    }

}