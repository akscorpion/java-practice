```java
class Solution {
    public static double average(int[] salary) {
        
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = 0, sum = 0;
        
        for(int i:salary){
            if(i < minSalary)
                minSalary = i;
            
            if(i > maxSalary)
                maxSalary = i;
            
            sum += i;
        }
        return (double) (sum - (minSalary + maxSalary))/(salary.length - 2);
    }
}
```