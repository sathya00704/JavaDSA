public class Q06StringContainsGoal {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        if(s.length()!=goal.length()){
            System.out.println(false);
            return;
        }
        String r = s+s;
        System.out.println(r.contains(goal));
    }
}
