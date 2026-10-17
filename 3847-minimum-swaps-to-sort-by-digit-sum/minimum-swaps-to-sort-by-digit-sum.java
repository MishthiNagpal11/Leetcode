class Solution {
    public int minSwaps(int[] nums) {
        int [][] arr= new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            arr[i][0]=nums[i];
            arr[i][1]=sum;
        }  
        Integer[] order= new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            order[i]=i;
        }
        Arrays.sort(order,(a,b)->{
            if(arr[a][1]!= arr[b][1]){
                return arr[a][1]-arr[b][1];
            }
            else{
                return arr[a][0]-arr[b][0];
            }
        });
        int[] target= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            target[i]=arr[order[i]][0];
        }
        Map <Integer, Integer> pos= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            pos.put(nums[i],i);
        }
        int swaps=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target[i]){
                int j=pos.get(target[i]);
                pos.put(nums[i],j);
                pos.put(target[i],i);   

                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                swaps++;
            }
            

        }
        return swaps;
    }
}