public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        
        int l = nums.length;

        if (nums[l-1] < target) {
            return l;
        }else if (nums[0] > target ) {
            return 0;
        }
        for(int i=0; i<l; i++){
            if (nums[i]==target) {
                return i;
            }

            else if (i<l-1 && nums[i] < target && nums[i+1] > target) {
                return i+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] myArr = {1,3 ,6 ,7};
        System.out.println(searchInsert(myArr, 8));
    }


}
