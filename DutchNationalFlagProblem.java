
public class DutchNationalFlagProblem {

    public static void dnfSort(int[] arr){
        int i = 0, j = 0, k = arr.length-1;
        while(i<=k){
            if(arr[i]==0){
                Sort.swap(arr, i, j);
                i++;
                j++;
            } else if(arr[i]==1){
                i++;
            } else if(arr[i]==2){
                Sort.swap(arr, i, k);
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1 , 2, 1 ,0 ,1, 2 , 0, 0 ,1 };
        dnfSort(arr);
        Sort.display(arr);
    }
}
