import java.util.Scanner; 

public class Tempojogo2{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       
       int hI,hF,mI,mF,tempoMin,tempoHrf,tempoMinf;

       hI = teclado.nextInt()*60;
       mI = teclado.nextInt();
       hF = teclado.nextInt()*60;
       mF = teclado.nextInt();

       tempoMin = hI+hF+mI+mF;
       tempoHrf = tempoMin / 60;
       tempoMinf = ((tempoMin - (tempoHrf))/60);
      
     //  if (tempoMin >= 0){

      // }

       
       System.out.println("O JOGO DUROU "+tempoHrf+" HORAS(S) E "+tempoMinf+" MINUTOS");

    }

}