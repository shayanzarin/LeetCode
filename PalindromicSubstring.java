public class PalindromicSubstring {

    public static String longestPalindrome(String s) {
        char[] charString = s.toCharArray();

        int max=0;
        int first =0;
        int last =0;

        for(int i=0; i<=charString.length; i++){

            for(int j=i+1; j<charString.length; j++){
                if (checkString(charString, i, j)) {
                    if (j-i > max) {
                        max = j-i;
                        first = i;
                        last = j;
                    }
                }
            }
        }

        StringBuilder stringBuilder=new StringBuilder();
        for (int k=first; k<=last; k++)
            stringBuilder.append(charString[k]);
        

        return stringBuilder.toString();
    }

    public static boolean checkString(char[] cahrsArray, int start, int end){
       
        boolean flag = false;
        for(int i=start; i<end; i++){
            
            if (cahrsArray[i] == cahrsArray[end]) {
                flag = true;
            }else
                return false;
            end --;
        }
        
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));

    }
}
