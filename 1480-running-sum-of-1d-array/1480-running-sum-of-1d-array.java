class Solution {
    public int[] runningSum(int[] nums) {
        //ArrayList<Integer> result = new ArrayList<Integer>();
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            // System.out.println("nums[i]:"+ nums[i]);
            result[i] = nums[i] + result[i-1];
            // System.out.println("result[i]:"+ result[i]);                  
        }

        return result;
    
    }
}