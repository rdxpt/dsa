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
    }
}