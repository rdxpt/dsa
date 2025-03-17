package problem75LC;

public class ContainerWithMostWater {
    public static int maxArea(int[] height){
        int n = height.length;
        int i = 0, j = n-1;
        int maxVol = 0;
        while(i<=j){
            if(height[i]>height[j]){
                if(height[j]*(j-i)>maxVol) maxVol = height[j]*(j-i);
                j--;
            } else {
                if(height[i]*(j-i)>maxVol) maxVol = height[i]*(j-i);
                i++;
            }
        }
        return maxVol;
    }
}
