package problem75LC;

public class SecondHighestInArray{
    public static int secondHighest(int[] nums){
        int highest = Integer.MIN_VALUE; //     min 8   8   8   14  19  26  32
        int secHighest = Integer.MIN_VALUE; //  min min 1   7   8   14  19  26
        for(int i : nums){  
            if(i>highest){
                secHighest = highest;
                highest = i;
            } else if(i>secHighest && i<highest){
                secHighest = i;
            }
        }
        return secHighest;
    }
    public static void main(String[] args) {
        int[] nums = {-5, -15};
        System.out.println(secondHighest(nums));
    }
}