
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello world!");
        
        Solution obj = new Solution();
        
       int[] nums = {2,6,4,8,10,9,15};

       int res = obj.findUnsortedSubarray(nums);
       
       System.out.println(res);
	}

}
