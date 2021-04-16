import java.util.Scanner; //Preciso importar a Biblioteca

public class Trapezio{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
                        
       double area;
       double basemaior;
       double basemenor;
       double altura;

        System.out.println("Digite o valor da base maior");
        basemaior = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + basemaior);

        System.out.println("Digite o valor da base menor");
        basemenor = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + basemenor);

        System.out.println("Digite o valor da altura");
        altura = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + altura);

        area = ((basemaior+basemenor)*altura)/2;
        System.out.println("A area do trapezio = " + area);
        System.out.printf("O valor da area = %.4f\n", area);


    }

}