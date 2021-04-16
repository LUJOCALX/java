import java.util.Scanner; //Preciso importar a Biblioteca

public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); //Cria o componemte Scanner informando que ele irá ler no teclado (dispositivo de entrada
        
        
        
        int a;
        float b;
        double c;

        System.out.println("Digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Voce digitou o valor = " + a);

        System.out.println("Digite um valor float");
        b = teclado.nextFloat();
        System.out.println("Voce digitou o valor = " + b);

        System.out.println("Digite um valor double");
        c = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + c);

        System.out.printf("Voce digitou \n%d \n%.3f \n%.6f \n", a,b,c);

    }

}