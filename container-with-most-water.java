public class mixWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
                for (int left = 0; left < height.length; left++) {
            for (int right = left + 1; right < height.length; right++) {
                int width = right - left;                
                int minHeight = Math.min(height[left], height[right]);
                int area = width * minHeight;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        
        return maxArea;
    }
}