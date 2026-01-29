/**
 * G en er at eB in ar yN um be rs
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
public class GenerateBinaryNumbers {
    public static String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> q = new Queue<>();
        q.enqueue("1");
        for(int i = 0; i<n; i++){
            result[i] = q.dequeue();
            String n1 = result[i]+"0";
            String n2 = result[i]+"1";
            q.enqueue(n1);
            q.enqueue(n2);
        }
        return result;
    }
    public static void displayRes(String[] result){
        for(String bin : result){
            System.out.println(bin+" ");
        }
    }
    public static void main(String[] args) {
        String[] result = generateBinaryNumbers(20);
        displayRes(result);
        
    }
}

