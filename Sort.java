public class Sort {

    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++)System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j+1);
                    swapped = true;
            }
            if(!swapped)break;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;
            } 
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<arr[min])min = j;
            }
            swap(arr, i, min);
        }
    }

    public static int[] mergeTwoSortedArray(int[] arrX, int[]  arrY){
        int cap = arrX.length+arrY.length;
        int[] arr = new int[cap];
        int x = 0, y = 0, i = 0;

        while(x<arrX.length && y<arrY.length){
            if(arrX[x]<arrY[y]){
                arr[i] = arrX[x];
                x++;
            } else {
                arr[i] = arrY[y];
                y++;
            }
            i++;
        }
        while(x<arrX.length){
            arr[i++] = arrX[x++];
        }
        while(y<arrY.length){
            arr[i++] = arrY[y++];
        }
        return arr;
    }

    public static void mergeSort(int arr[]){
        if(arr == null || arr.length <= 1) return;
        mergeSort(arr, 0, arr.length-1);
    }
    public static void mergeSort(int[] arr, int left, int right){
        if(left>=right)return;
        int mid = left + (right-left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left +1;
        int n2 = right-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i = 0; i< n1; i++) leftArr[i] = arr[left+i];
        for(int j = 0; j< n2; j++) rightArr[j] = arr[mid + 1+ j];

        int i = 0, j=0, k=left;
        while(i<n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while(i<n1){
            arr[k++] = leftArr[i++];
        }
        while(j<n2){
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 18, 55, 60, 111, 112 };
        arr = mergeSort(arr);
        display(arr);
    }
}