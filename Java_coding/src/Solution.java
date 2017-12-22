
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        
        if(nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return 0;
        
        if(nums.length == 2)
            if(nums[0] <= nums[1])
                return 0;
            else
                return 2;
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[start] <= nums[i])
                start++;
            else
                break;                        
        }
        
        //[1,3,2,2,2] have issue at this situation
        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[end] >= nums[i])
            {
            	System.out.println("###end is:" + end);
                end--;
            }
            else
                break;
        }
        
        System.out.println("start is:" + start);
        System.out.println("end is:" + end);
        
        int res_length = end - start + 1;
        
        return res_length;
        
    }
}