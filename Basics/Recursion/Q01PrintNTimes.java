class Q01PrintNTimes {
    public static void printN(String name, int cnt, int n){
        if(cnt==n){
            return;
        }
        System.out.println(name);
        printN(name, cnt+1, n);
    }
    public static void main(String[] args) {
        printN("Sathya", 0, 5);
    }
}
