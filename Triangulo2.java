import java.util.Scanner; //Preciso importar a Biblioteca

public class Triangulo2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
                
       double A,B,C,area,perimetro;
       A = teclado.nextDouble();
       B = teclado.nextDouble();
       C = teclado.nextDouble();

       perimetro=A+B+C;
       area=((A+B)*C)/2;

       if ((A + B) > C  && (B + C) > A && (A + C) > B){System.out.printf("Perimetro = %.1f\n",perimetro);}
       else
       System.out.printf("Area = %.1f\n",area);

    }

}