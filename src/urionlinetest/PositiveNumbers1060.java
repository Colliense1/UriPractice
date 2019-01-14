
package urionlinetest;

import java.util.Scanner;

public class PositiveNumbers1060 {
    public static void main(String[] args) {
        int i;
        int j=0;
        float t;
        Scanner input = new Scanner(System.in);
        for(i = 0;i < 6;i++){
            t = input.nextFloat();
            if(t >= 0)j++;
        }
         System.out.printf("%d valores positivos\n",j);

    }
    
}
