import java.util.Scanner;

public class DominoPiling {


    
    public static void main(String[] args) {

        try{
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((n*m)/2);
        scanner.close();;
        }catch(Exception e){
            System.out.println("bad input");
        }



    }
}