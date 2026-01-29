/**
 * L in ea rS ea rc h
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
 *
 * Key idea:
 * - Binary-search on answer/index; maintain correct invariants for low/high.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Binary Search
 */
public class LinearSearch {
    public int search(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x)return i;
        } 
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 15, 20};
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.search(arr, 15));
    }
}

