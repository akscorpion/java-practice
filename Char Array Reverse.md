```java
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int i = 0;
        while(i < (len/2)){
            char ch = s[i];
            s[i] = s[len - (i + 1)];
            s[len - (i + 1)] = ch;
            i++;
        }
    }
}
```