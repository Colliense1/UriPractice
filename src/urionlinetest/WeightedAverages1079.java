
package urionlinetest;

import java.util.Scanner;

public class WeightedAverages1079 {
    public static void main(String[] args) {
        int i;
        int j;
        float a;
        float b;
        float c;
        float t;
        float wa;
        Scanner input = new Scanner (System.in);
        j = input.nextInt();
        for(i = 0;i < j; i++){
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();
            t = a*2+b*3+c*5;
            wa = t/10;
            System.out.printf("%.1f\n",wa);
        }
        
    }
    
}
