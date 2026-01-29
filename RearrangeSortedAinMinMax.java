/**
 * R ea rr an ge So rt ed Ai nM in Ma x
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
 * Tags: Sorting
 */
public class RearrangeSortedAinMinMax {
    public static void rearrange(int[] arr){
        int minIdx = 0;
        int maxIdx = arr.length-1;
        int max = arr[maxIdx]+1;
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[maxIdx]%max)*max;
                maxIdx--;
            } else {
                arr[i] = arr[i] + (arr[minIdx]%max)*max;
                minIdx++;
            }
        }
        for(int i=0; i<arr.length; i++)arr[i]=arr[i]/max;
    }
    public static void display(int[] arr){
        System.out.print("[");
        for(int i : arr)System.out.print(i+ " ");
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {23, 42, 52, 70, 81, 96};
        display(arr);
        rearrange(arr);
        display(arr);
    }
}

