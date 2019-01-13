
package urionlinetest;

import java.util.Scanner;

public class Ele1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double R,sphere;
        R = input.nextDouble();
        
        sphere = 1.333333333333333*3.14159*R*R*R;
        
        System.out.printf("VOLUME = %.3f\n",sphere);
    }
    
}
