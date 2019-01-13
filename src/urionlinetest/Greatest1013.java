
package urionlinetest;

import java.util.Scanner;

public class Greatest1013 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int ab;
        int abc;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        ab = (a+b+Math.abs(a-b))/2;
        abc = (ab+c+Math.abs(ab-c))/2;
        System.out.println(abc +" eh o maior");
    }
    
}
