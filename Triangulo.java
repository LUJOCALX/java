import java.util.Scanner; //Preciso importar a Biblioteca

public class Triangulo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
                
       double area;
       double base;
       double altura;

        System.out.println("Digite o valor da base");
        base = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + base);

        System.out.println("Digite o valor da altura");
        altura = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + altura);

        area = (base*altura)/2;
        System.out.println("A area do triangulo = " + area);


    }

}