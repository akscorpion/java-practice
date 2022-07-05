```java
public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}
```

my code
```java
class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        boolean carry = true;
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] + 1 > 9 && carry){
                if(carry){
                    stack.pop();
                }
                stack.push(0);
                stack.push(1);
                carry = true;
            }else{
                if(carry){
                    stack.pop();
                    stack.push(digits[i] + 1);
                    carry = false;
                }else{
                    stack.push(digits[i]);
                }
            }
        }
        int[] arr = new int[stack.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = stack.pop();
        }
        return arr;
    }
}
```