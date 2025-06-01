import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSum {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> resuList = new ArrayList<>();

        Arrays.sort(nums);
        
        for (int i=0; i<nums.length - 2; i++){
            int left = i+1; 
            int right = nums.length-1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;  
            }

            while (left < right) {

                int sum = nums[right] + nums[left] + nums[i];

                if(sum == 0){
                    resuList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left ++;
                    right --;
                }

                else if (sum < 0) {
                    left ++;
                } else{
                    right --;
                }
                
            }
        }

        return resuList;
    }

    public static void main(String[] args) {

        int[] input  = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(input));
        
    }
}
