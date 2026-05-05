public class Q02ReverseWordsInAString {
    public static void main(String[] args) {
        //String s = "the sky is blue";
        String s = "a good    example";
        StringBuilder ns = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String word=s.substring(i+1, end+1);
            if(ns.length()>0){
                ns.append(" ");
            }
            ns.append(word);
        }
        System.out.println(ns.toString());
    }
}