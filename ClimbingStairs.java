public class ClimbingStairs {
    public  static int climbStairs(int n) {
        int count = 0; 
        int stepFirst = 1;
        int stepSecond = 2; 

        if (n <=3 ) {
            return n;
        }

        for(int i = 3; i <= n; i++){
            count = stepFirst + stepSecond;
            stepFirst = stepSecond;
            stepSecond = count;
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
