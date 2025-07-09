import java.util.Stack;

public class ValidParantheses {
    public  static boolean isValid(String s) {
        if (s.length() % 2 !=0) {
            return false;
        }


        Stack<Character> stack=new Stack<>();

        for (char ch  : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch =='[') {
                stack.push(ch);
            }
            else{
                if (stack.isEmpty()) {
                    return false;   
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                 }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String st="((";
        System.out.println(isValid(st));        
    }
}
