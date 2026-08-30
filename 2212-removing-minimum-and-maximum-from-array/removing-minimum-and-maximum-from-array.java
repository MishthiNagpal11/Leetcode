class Solution {
    public int minimumDeletions(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int maxIndex=0;
        int minIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
                
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }    
        int left=Math.max(minIndex,maxIndex)+1;
        int right=nums.length - Math.min(minIndex,maxIndex);
        int both = (Math.min(minIndex, maxIndex) + 1) + nums.length - Math.max(minIndex, maxIndex);
        
        
        int result = Math.min(left, Math.min(right, both));
        return result;   
    }

}