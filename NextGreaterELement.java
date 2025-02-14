public class NextGreaterELement {

    public static void displayArr(int[] arr){
        System.out.print("[");
        for(int i: arr){
            System.out.print(" "+i);
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static int[] ngrBSC(int[] arr){
        int[] ngr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            boolean flag = false;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    ngr[i] = arr[j];
                    flag = true;
                    break;
                }
            }
            if(!flag)ngr[i]=-1;
        }
        return ngr;
    }

    public static int[] ngrADV(int[] arr){
        int[] result = new int[arr.length];
        Stack_Arr<Integer> stack = new Stack_Arr<>(arr.length);
        for(int i = arr.length-1; i>=0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && arr[i]>=stack.peek()){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    

    public static void main(String[] args) {
        int[] arr = {4,7,3,4,8,1};
        displayArr(arr);
        displayArr(ngrBSC(arr));
        displayArr(ngrADV(arr));
    }
}
