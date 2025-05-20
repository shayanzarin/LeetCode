public class Zigzag {
    public static String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean down = false;

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows-1) {
                down = !down;
            }

            if (down) {
                currentRow ++;
            }else
                currentRow--;

        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder sb:rows){
            result.append(sb);
        }
    
        return result.toString(); 
    }



    public static void main(String[] args) {
        
        System.out.println("out put: " + convert("PAYPALISHIRING",4));

    }
    
}
