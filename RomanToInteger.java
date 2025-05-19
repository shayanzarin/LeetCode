import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

        
    public static int romanToInt(String s) {
        
        Map<Character, Integer> romanMap=new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; 
        char[] chars=s.toCharArray();

        for(int i=0; i<chars.length; i++){
            if (i<chars.length-1 && romanMap.get(chars[i]) < romanMap.get(chars[i+1])) {
                result += romanMap.get(chars[i+1]) - romanMap.get(chars[i]);
                i++;
            }else {
                result += romanMap.get(chars[i]);
            }

        } 
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Roman to Integer: " + romanToInt("MCMXCIV"));


    }
}

