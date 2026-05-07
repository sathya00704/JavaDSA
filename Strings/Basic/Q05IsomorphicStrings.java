public class Q05IsomorphicStrings {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        int[] m1=new int[256];
        int[] m2=new int[256];
        int n=s.length();
        for(int i=0;i<n;++i){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]){
                System.out.println(false);
                return;
            }
            m1[s.charAt(i)]=i+1;
            m2[t.charAt(i)]=i+1;
        }
        System.out.println(true);
    }
}