import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        if(phone_book.length == 1){
            return true;
        }
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length - 1; i++){
            boolean ok = false;
            String a = phone_book[i];
            String b = phone_book[i + 1];
            
            int len = Math.min(a.length(), b.length());
            for(int j = 0; j < len; j++){
                if(a.charAt(j) != b.charAt(j)){
                    ok = true;
                }
            }
            if(!ok){
                return false;
            }
        }
        return true;
    }
}