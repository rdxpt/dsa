package problem75LC;

public class TowersOfHanoi {
    public static void TOH(int n, char A, char B, char C){
        if(n==1){
            System.out.println("Move disk 1 from "+ A + " to " + C);
            return;
        }

        TOH(n-1, A, C, B);
        System.out.println("Move disk " + n + " from " + A + " to " + C);
        TOH(n-1, B, A, C);
    }
    public static void main(String[] args) {
        TOH(4, 'A', 'B', 'C');
    }
}
