import java.util.Arrays;

public class SumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int resultSum = nums[0] + nums [1] + nums[n-1];

        for(int i =0; i<n-2; i++){
            
            int left = i+1;
            int right= n-1;


            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if (currentSum == target) {
                    return currentSum;
                }

                if (Math.abs(currentSum - target) < Math.abs(resultSum-target)) {
                    resultSum = currentSum;
                }

                if (currentSum < target) {
                    left ++;
                }else{
                    right --;
                }
            }
        }

        return resultSum;
    }

    public static void main(String[] args) {
        int[] test = {-1,2,1,-4};
        System.out.println(threeSumClosest(test, 1));
    }
}