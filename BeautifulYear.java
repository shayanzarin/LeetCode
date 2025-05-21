import java.util.Scanner;

public class BeautifulYear {

    public static int getBeautifulYear(int year){
        
        boolean flag = true; 
        int resultYear = year+1;

        while (flag) {
            if (checkYear(resultYear)) {
                flag = false;
            }else{
                resultYear ++;
            }
        }



        return resultYear;
    }

    public static boolean checkYear(int y){

        int[] arr=new int[4];
        for(int i=0; i<4; i++){
            arr[i] = y%10;
            y /= 10;
        }

        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if (i != j && arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;

    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String myYear = scanner.nextLine();
            System.out.println(getBeautifulYear(Integer.parseInt(myYear)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
