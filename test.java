public class test{
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=low, j=low;
        while(i<high){
            if(arr[i]<=pivot){
                swap(arr, i, j);
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    public static void merge(int[] arr, int[] temp, int low, int mid, int high){
        for(int i=low; i<=high; i++)temp[i] = arr[i];
        int i=low, j=mid+1, k=low;
        while(i<mid && j<high){
            if(temp[i]<=temp[j]){
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k++] = temp[i++];
        }
        while(j<=high){
            arr[k++] = temp[j++];
        }
    }

    public static int[] mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
        return temp;
    }
    public static void mergeSort(int[] arr, int[] temp, int low, int high){
        if(low<high){
            int mid = low+ (high-low)/2;
            mergeSort(arr, temp, low, mid );
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}