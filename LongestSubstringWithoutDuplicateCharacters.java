public class LongestSubstringWithoutDuplicateCharacters {

        public static int lengthOfLongestSubstring(String s) {
            
            int[] charIndex = new int[128];

            for (int i=0; i<128; i++) {
                charIndex[i] = -1;
            }
            int max = 0; 
            int start = 0; 

            for(int end=0; end < s.length(); end++){
                char currentChar = s.charAt(end);

                if (charIndex[currentChar] >= start) {
                    start = charIndex[currentChar] +1; 
                }

                charIndex[currentChar] = end;
            
                max = Math.max(max, end - start + 1);

            }
            

            return max; 
        }

        public static void main(String[] args) {
            String string = "abcabcbb";
            System.out.println(lengthOfLongestSubstring(string) );
        }
        
}
