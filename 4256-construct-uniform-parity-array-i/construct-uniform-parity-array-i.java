class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2= new int[nums1.length]; 
        boolean hasOld= false;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2 !=0){
                hasOld=true;
                break;
            }
        }
        if(hasOld){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2 !=0){
                    nums2[i]=nums1[i];
                }
                else{
                    for(int j=0;j<nums1.length;j++){
                        if(j!=0 && nums1[j]%2 !=0){
                            nums2[i]=nums1[i]-nums1[j];
                            break;
                        }
                    }
                }
            }
        }
        else{
            for(int i=0;i<nums1.length;i++){
                nums2[i]=nums1[i];
            }
        }
        return true;
    }
}