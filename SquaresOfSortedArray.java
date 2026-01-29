/**
 * S qu ar es Of So rt ed Ar ra y
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
 *
 * Key idea:
 * - Sort to enable greedy/two-pointers/dedup; be mindful of stable vs unstable needs.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Sorting, Array
 */
public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int i=0, j=n-1;
        for(int k = n-1; k>=0; k--){
            if(Math.abs(arr[i])>=Math.abs(arr[j])){
                result[k] = arr[i]*arr[i];
                i++;
            } else {
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        Sort.display(arr);
        int[] res = sortedSquares(arr);
        Sort.display(res);
    }
}

