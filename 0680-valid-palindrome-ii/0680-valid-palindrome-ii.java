class Solution {
    public static boolean func(String s,int low,int right){
        
         while(low<right){
            char l=s.charAt(low);
            char r=s.charAt(right);
            if(l!=r){
                return false;


            }
            low++;
            right--;

        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int low=0;
        int right=s.length()-1;

        while(low<right){
            char l=s.charAt(low);
            char r=s.charAt(right);
            if(l!=r){
                return func(s,low+1,right)||func(s,low,right-1);


            }
            low++;
            right--;

        }
        return true;
        
    }
}