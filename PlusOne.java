import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        int lengh = digits.length;
        for(int i=lengh-1; i>=0; i--){

            if (digits[i] != 9) {
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[lengh+1];
        result[0] = 1;
        return result;

    }


    public static void main(String[] args) {

        PlusOne po=new PlusOne();
        int test[] = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(po.plusOne(test)));


    }
}
