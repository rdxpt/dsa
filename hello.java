
public class hello {

    public static void printArray(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", "); // Proper formatting
        }
        System.out.print(" ]");
    }

    public static int[] zeroesInTheEnd(int[] a){
        int zeroCount = 0;
        int index = 0;
        for(int i : a){
           if(i==0)zeroCount++;
           else{
            a[index] = i;
            index++;
           }
        }

        for(int i = 0; i<zeroCount; i++){
            a[index] = 0;
            index++;
        }

        return a;
    }

    public int[] resize(int[] a, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i<a.length; i++){
            temp[i] = a[i];
        }
        a = temp;
        return a;
    }

    public static double findMissingNumber(int[] arr, int n){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return (n*(n+1)*0.5)-sum;
    }

    public static int[] zeroesInTheEnd2(int[] a){
        int j=0;

        for(int i = 0; i<a.length-1;i++){
            if(a[i] != 0 && a[j]==0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            if(a[j]!=0){
                j++;
            }
        }

        return a;
    }

    public static boolean isPalindrome(String word){
        char[] wordArray = word.toCharArray();
        for(int i=0; i<word.length()/2; i++){
            if(wordArray[i]!=wordArray[word.length()-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("madam"));
    }
    
}
