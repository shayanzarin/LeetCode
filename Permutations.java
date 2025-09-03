import java.util.ArrayList;
import java.util.List;

public class Permutations {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(nums, new ArrayList<>(), result);


            return result;
        
    }

        public void backtrack(int[] nums, List<Integer> courrent, List<List<Integer>> result){
            if (courrent.size() == nums.length){
                result.add(new ArrayList<>(courrent));
                return;
            }

            for (int num: nums){
                if (courrent.contains(num)) {
                    continue;
                }else{
                    courrent.add(num);
                    backtrack(nums, courrent, result);
                    courrent.remove(courrent.size()-1);
                }
            }
        }

        public static void main(String[] args) {
            Permutations p=new Permutations();
            int[] nums = {1, 2, 3};
            List<List<Integer>> test = p.permute(nums);
            System.out.println(test);
        }
}
