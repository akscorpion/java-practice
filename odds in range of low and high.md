
```java
class Solution {
public static int countOdds(int low, int high) {
        //checking if low and high are both odds or not
        boolean isLowOdd = !(low%2==0);
        boolean isHighOdd = !(high%2==0);
        
        int count = (high - low) + 1; //count of total digits in the range
        
        if(isLowOdd && isHighOdd){
            return (count/2) + 1;
        } else{
            return count/2;
        }
    }
}
```