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
