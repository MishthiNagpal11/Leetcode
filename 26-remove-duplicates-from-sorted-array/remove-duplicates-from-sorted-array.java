class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        int unique=i+1;
        return unique;
        
    }
}