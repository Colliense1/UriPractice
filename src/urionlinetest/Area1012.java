
package urionlinetest;

import java.util.Scanner;

public class Area1012 {
    public static void main(String[] args) {
        float A;
        float B;
        float C;
        double pi = 3.14159;
        double triangle;
        double circle;
        double trapezium;
        double square;
        double rectangle;
       Scanner input= new Scanner(System.in); 
       A = input.nextFloat();
       B = input.nextFloat();
       C = input.nextFloat();
       triangle = .5 * A * C;
       circle = pi * (C*C);
       trapezium = (((A+B)/2)* C);
       square = (B * B);
       rectangle = (A *B );
       System.out.printf("TRIANGULO: %.3f\n",triangle);
       System.out.printf("CIRCULO: %.3f\n",circle);
       System.out.printf("TRAPEZIO: %.3f\n",trapezium);
       System.out.printf("QUADRADO: %.3f\n",square);
       System.out.printf("RETANGULO: %.3f\n",rectangle);
    
    }
    
}
