import java.util.Scanner;

public class Expression {

    public static int maximumOutput(int a, int b, int c){

        int result1 = a + b + c;
        int result2 = a * b * c;
        int result3 = (a + b) * c;
        int result4 = a * (b + c);

        int maxValue = result1;

        if (result2 > maxValue) {
            maxValue = result2;
        }
        if (result3 > maxValue) {
            maxValue = result3;
        }
        if (result4 > maxValue) {
            maxValue = result4;
        }

        return maxValue;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {

                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                System.out.println(maximumOutput(a, b, c));
            
        }catch(Exception e){
            System.out.println("invalid");
        }
        
        scanner.close();



        
    }
}
