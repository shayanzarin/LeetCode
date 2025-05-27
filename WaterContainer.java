public class WaterContainer {

    public static int maxArea(int[] height) {
        
        int x=0; 
        int length = height.length;
        int y=length-1;

        int maxArea=0;
        
        while (x < y) {


            int w = y-x;
            int tempArea=0; 

            if (height[x] <= height[y]) {
                tempArea = height[x] * w;
                if (tempArea > maxArea) {
                    maxArea =tempArea;
                }
                x++;
            }else if (height[x] > height[y]) {
                tempArea = height[y] * w;
                if (tempArea > maxArea) {
                    maxArea =tempArea;
                }
                y --;
            }else{
                x ++;
                y --;
            }

        }

        return maxArea;
    }
    public static void main(String[] args) {

        int[] test = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test));
        
    }
}