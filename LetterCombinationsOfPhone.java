import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public  class LetterCombinationsOfPhone {

    public static final Map<Character, String> digitToChar = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();    
        if (digits == null || digits.isEmpty() || digits.equals("1")) return result;
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = digitToChar.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
}
