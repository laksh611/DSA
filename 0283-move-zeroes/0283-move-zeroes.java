class Solution {
    public static void swap(int[] nums,int l,int h){
        int temp=nums[l];
        nums[l]=nums[h];
        nums[h]=temp;
    }
    public void moveZeroes(int[] nums) {

        int l=0,h=0;
        while(h<nums.length){
            if(nums[h]==0){
                h++;
            }
            else{
                swap(nums,l,h);
                l++;
                h++;
            }
        }
        
    }
}