import java.util.Scanner;

public class Football {
    
    public static void main(String[] args) {
        
        String input =new String();
        try {
            Scanner scanner=new Scanner(System.in);
            input = scanner.nextLine();
            scanner.close();;
        } catch (Exception e) {
            System.out.println("bad input ");
        }

    char[] charArr = input.toCharArray();
    
    int counter0 = 0; 
    int counter1 = 0;
    boolean situation = false;
    for (char c : charArr) {
        if (c == '0') {
            counter0++;
            counter1 = 0;
        }else{
            counter1 ++;
            counter0 = 0;
        }

        if (counter0 >=7 || counter1 >=7) {
            situation = true;
        }

    }

    if (situation) {
        System.out.println("YES");
    }else
        System.out.println("NO");



    }
}
