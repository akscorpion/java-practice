NEW (Faster and Less Memory)
```java
class Solution {
    public boolean isValid(String s) {
        
        if(!(s.length()%2 == 0)) return false;
	    
        Stack<Character> stack = new Stack<Character>();
	    
        for (char c : s.toCharArray()) {
            
            if (c == '(')
                stack.push(')');
            
            else if (c == '{')
			    stack.push('}');
            
            else if (c == '[')
			    stack.push(']');
            
            else if (stack.isEmpty() || stack.pop() != c)
			    return false;
        }
        
        return stack.isEmpty();
    }
}
```

OLD
```java
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length() - 1;) {
            
            if ( sb.substring(i, i+2).equals("()") ||
                 sb.substring(i, i+2).equals("{}") ||
                 sb.substring(i, i+2).equals("[]")) {
                
                   sb.delete(i, i + 2);
                   i = 0;
                
            } else {
                i++;
            }
        }
        
        return sb.isEmpty();
    }
}
```