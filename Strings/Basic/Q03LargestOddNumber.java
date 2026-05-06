public class Q03LargestOddNumber {
    public static void main(String[] args) {
        String num = "52";
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i) - '0') % 2 != 0){
                System.out.println(num.substring(0,i+1));
                return;
            }
        }
        System.out.println("");
    }
}