```java
class RomanValue{
    private final HashMap<Character, Integer> romanValue = new HashMap<>(7);
    RomanValue (){
        romanValue.put('I',1);
        romanValue.put('V',5);
        romanValue.put('X',10);
        romanValue.put('L',50);
        romanValue.put('C',100);
        romanValue.put('D',500);
        romanValue.put('M',1000);
    }

    public int getValue(char romanNumeral){
        return romanValue.get(romanNumeral);
    }
}

class Solution {
    
    public static int romanToInt(String s) {
        RomanValue roman = new RomanValue();
        int len = s.length();
        int romanValue = 0;
        for(int i=0;i<len-1;i++){
            int curr = roman.getValue(s.charAt(i));
            int next = roman.getValue(s.charAt(i+1));
            if(curr < next)
                romanValue -= curr;
            else
                romanValue += curr;
        }
        return romanValue+roman.getValue(s.charAt(len-1));
    }
}
```