import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int number = myNumber(digits) +1;

        int myLength =0 ;
        if (digits[digits.length-1] == 9) {
            myLength = digits.length;
        }else{
            myLength = digits.length-1;
        }

        
        

        return null;

    }

    public int myNumber(int [] digits){

        int result =0 ;
        int counter=0; 
        for(int i=digits.length-1; i>=0; i--){
            result += digits[i] * Math.pow(10, counter);
            counter ++;
        }

        return result;
    }
    public static void main(String[] args) {

        PlusOne po=new PlusOne();
        int test[] = {1,3,4 };
        System.out.println(Arrays.toString(po.plusOne(test)));

        System.out.println(po.myNumber(test));
    }
}
