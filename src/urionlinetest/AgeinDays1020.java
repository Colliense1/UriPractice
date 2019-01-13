
package urionlinetest;

import java.util.Scanner;

public class AgeinDays1020 {
    public static void main(String[] args) {
        int year;
        int month;
        int day;
        int n;
        Scanner input  = new Scanner(System.in);
        n = input.nextInt();
        year = n / 365;
        n = n % 365;
        month = n / 30;
        day = n%30;
        System.out.println(year+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(day+" dia(s)");
        
    }
    
}
