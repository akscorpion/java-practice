```java
public static int hammingWeight(int n) {
	int ones = 0;
    	while(n!=0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
}
```

old
```java
    public int hammingWeight(int n) {
        int hw = 0;
        if (n == 0)
            return 0;
        else if (n > 0) {
            while (n != 0) {
                if (n % 2 == 1)
                    hw++;
                n /= 2;
            }
        } else {
            for (char c:Integer.toBinaryString(n).toCharArray())
                if (c == '1')
                    hw++;
        }
        return hw;
    }
```