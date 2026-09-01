public class Q07StringPalindrome {
    public static Boolean palindrome(int i, String name){
        if(i>=name.length() / 2){
            return true;
        }
        if(name.charAt(i) != name.charAt(name.length()-i-1)){
            return false;
        }
        return palindrome(i+1,name);
    }
    
    public static void main(String[] args){
        String name = "malayalam";
        System.out.println(palindrome(0, name));
    }
}
