
package urionlinetest;

import java.util.Scanner;

public class DisTwoPoints1015 {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double a;
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        a = Math.sqrt(Math.pow((x2-x1), 2)+(Math.pow(y2-y1, 2)));
        System.out.printf("%.4f\n",a);
    }
    
}
