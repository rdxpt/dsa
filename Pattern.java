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
