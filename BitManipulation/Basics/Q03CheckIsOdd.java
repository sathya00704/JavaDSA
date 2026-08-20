public class Q03CheckIsOdd {
    public static boolean isOdd(int n) {
        // Your code goes here
        if(((1<<0) & n) == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(4));
    }
}
