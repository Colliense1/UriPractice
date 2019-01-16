
package urionlinetest;

import java.util.Scanner;

public class PositivesandAverage1064 {
    public static void main(String[] args) {
        int i;
        int pos = 0;
        float avg;
        float m = 0;
        float a;
        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < 6; i++){
            a = input.nextFloat();
            if(a > 0){
                m += a;
                pos++;
            }
        }
        avg = m/pos;
        System.out.printf("%d valores positivos\n%.1f\n",pos,avg);
            
    }
    
}
