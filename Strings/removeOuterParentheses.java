package Strings;

public class removeOuterParentheses {
    public String removeOuterParenthesess(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='(' ){
                if(cnt>0) sb.append(c);
                cnt++;
            } else{
                cnt--;
                if(cnt>0) sb.append(c);
            }
        }
        return sb.toString();
    }
} 
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(n) for the StringBuilder used to build the result string
