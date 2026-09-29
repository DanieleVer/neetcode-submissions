class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length * 2]; //12
        for(int i = 0; i < newArr.length/2;i++)
        {
            newArr[i] = nums[i];
        }
        int count = 0;
        for(int i = nums.length; i < newArr.length;i++)
        {
            newArr[i] = nums[count];
            count++;
        }
        return newArr;
    }
}