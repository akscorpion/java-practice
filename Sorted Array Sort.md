```java
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = nums.length > 0 ? 1 : 0;
        
        for (int num : nums)
            if (num > nums[count-1])
                nums[count++] = num;
        
        return count;
    }
}
```