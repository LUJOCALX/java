public class Continhas{
    public static void main(String args[]){
        int a, b, r;

        a = 14;
        b = 3;

        r = a + b;
        System.out.println("Valor da soma = " + r);
        r = a - b;
        System.out.println("Valor da soma = " + r);
        r = a * b;
        System.out.println("Valor da soma = " + r);
        r = a / b;
        System.out.println("Valor da soma = " + r);
        r = a % b;

        //double x;

        //Erro tentando colocar 64bits em 32bits 
        //Continhas.java:22: error: incompatible types: possible lossy conversion from double to float
        // float x;
        //x = 1.0/2;

        //Coloca o f para permitir essa conversão/compilação
        //float x;
        //x = 1.0f/2;

        System.out.println("Valor da soma = " + x);
    }

}