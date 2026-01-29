/**
 * p ri me
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
import java.util.Scanner;

public class prime{
    
    public static boolean primeByFor(int n){
        for(int i = 2; i<=n/2; i++){
            if(n%i==0)return false;
        }
        return true;
    }

    public static boolean primeByWhile(int n){
        int i = 1;
        while(i<=n/2){
            if(n%i == 0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println(primeByFor(num));
        System.out.print("Enter a number : ");
        num = scan.nextInt();
        System.out.println(primeByFor(num));
        scan.close();

        System.out.println("Hello WOrld");
    }

}
