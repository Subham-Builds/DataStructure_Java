public class Contain_Duplicate_LC {
    public static boolean containsDuplicate(int[] nums) {
        // int flag = 0;
        for(int i = 0; i<nums.length; i++)
        {
            // flag = 0;
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        
        return false;
        //First Sort then Execute single loop
        
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,1};
        System.out.println(containsDuplicate(num));


    }
}
