
package urionlinetest;

import java.util.Scanner;

public class SimpleSort1042 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int t;
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        j = input.nextInt();
        k = input.nextInt();
        a = i;
        b = j;
        c = k;
        if(i > j){t = i;i = j;j = t;}
        if(i > k){t = i;i = k;k = t;}
        if(j > k){t = j;j = k;k = t;}
        System.out.println(""+i);
        System.out.println(""+j);
        System.out.println(""+k);
        System.out.println("");
        System.out.println(""+a);
        System.out.println(""+b);
        System.out.println(""+c);
    }
    
}
