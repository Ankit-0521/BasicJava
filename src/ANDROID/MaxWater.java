package ANDROID;

public class MaxWater {
    public int maxArea(int[] height){
        int i = 0, j = height.length-1, maxwater = 0;
        while (i<j){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            int curarea = h*w;
            maxwater = Math.max( maxwater,curarea);
            if (height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        MaxWater mw = new MaxWater();
        int ans = mw.maxArea(height);
        System.out.println(ans);
    }
}
