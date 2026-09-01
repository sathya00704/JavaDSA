class Q05SingleNumber3 {    
    public static int[] singleNumber(int[] nums) {        
        int xor=0;
        for(int i: nums){
            xor=xor^i;
        }
        int diff = xor & -xor;
        int b=0;
        int c=0;
        for(int j: nums){
            if((j & diff) != 0){
                b=b^j;
            }
            else{
                c=c^j;
            }
        }
        if(b>c){
            return new int[]{c,b};
        }
        return new int[]{b,c};
    }

    public static void main(String[] args){
        int[] nums = new int[]{3,5,1,2,2,1};
        int[] ans = singleNumber(nums);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}