public class ReverseInteger {

        
    public static int reverse(int x) {
        int result=0; 
        String s = String.valueOf(x);
        int temp = x;


        if (x < (Integer.MIN_VALUE / 10)  || x > (Integer.MAX_VALUE / 10)) {
            return 0;
        }

        for(int i=0; i < s.length(); i++){
            result +=  temp%10;
            result *= 10;

            temp/= 10;
        }

        if (x<0) {
            result /= 10;
        }
       
        return result/10;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }
}
