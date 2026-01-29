/**
 * P at te rn
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
public class Pattern {
    public static void diamond(int n){
        for(int i=0; i<2*n+1; i++){
            for(int j=0; j<n+1;j++){
                if(i+j+1>n+1){
                    System.out.print('*');
                }
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        diamond(5);
    }
}

