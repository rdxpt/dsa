package problem75LC;

public class MoveZeroes {
    public static void display(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void moveZerosInOrder(int[] nums){
        int n = nums.length;
        int nonZeroIndex = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0) nums[nonZeroIndex++]=nums[i];
        }
        while(nonZeroIndex<n)nums[nonZeroIndex++]=0;
    }

    public static void moveZerosNotInOrder(int[] nums){ 
        int n = nums.length;
        int i=0, j=n-1;
        while(i<j){
            if(nums[i]!=0)i++;
            else if(nums[j]==0)j--;
            else {
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 4, 1, 1, 6, 0};
        display(nums);
        moveZerosInOrder(nums);
        display(nums);
        
    }
}
