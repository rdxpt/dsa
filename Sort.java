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

    public static int[] merge(int[] arrX, int[]  arrY){
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

    public static int[] mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
        return temp;
    }
    public static void mergeSort(int[] arr, int[] temp, int low, int high){
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }
    public static void merge(int[] arr, int[] temp, int low, int mid, int high){
        for(int i = low; i <= high; i++)temp[i]=arr[i];
        int i = low; int j = mid+1; int k = low;
        while(i<mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            } else {
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k] = temp[i];
            i++; k++;
        }
        while(j<=high){
            arr[k] = temp[j];
            j++; k++;
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1, 18, 55, 60, 111, 112 };
        int[] temp = mergeSort(arr);
        display(temp);
    }
}