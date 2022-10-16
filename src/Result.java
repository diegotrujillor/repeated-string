
public class Result {
    public static long repeatedString(String s, long n) {
        long quantity = 0;
        
        while (s.length() < n) {
            s += s;            
        }
        
        char charArray[] = s.toCharArray();
        for(int i=0; i < s.length() - 1; i++) {
            if (charArray[i] == 'a') {
                quantity++;
            }
        }
                
        return quantity;
    }
}
