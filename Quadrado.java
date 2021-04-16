import java.util.Scanner; //Preciso importar a Biblioteca

public class Quadrado{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
                
       double area;
       double lado;

        System.out.println("Digite o lado");
        lado = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + lado);

        area = lado*lado;
        System.out.println("A area do quadrado = " + area);


    }

}