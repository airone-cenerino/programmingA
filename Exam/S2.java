/**
 * S2
 */
public class S2 {

    static boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }else if(s.length()==2){
            return s.charAt(0) == s.charAt(1);
        }

        // ‚±‚±‚ÅŠO‘¤1•¶š‚¸‚Â‚ğ”äŠr
        boolean flg = s.charAt(0) == s.charAt(s.length()-1);

        // ŠO‘¤ˆê•¶š‚¸‚Â‚ğí‚éB
        String tmp="";
        for(int i=1;i<s.length()-1;i++){
            tmp += s.charAt(i);
        }
        s = tmp;

        if(isPalindrome(s) && flg){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("abcccbs"));
    }
}