```java
public class main
{
    static String originalString="abcabc";

    static String rearrange(String word, int index){
        return word.substring(word.length() - index) + word.substring(0, word.length() - index);
    }

    private static int operationCount(String word, int input1,int input2){
        int count=0;
        String tWord = rearrange(word, input1);
        count++;

        if (!tWord.equals(word)){
            while(!tWord.equals(word)){
                tWord = rearrange(tWord, input2);
                count++;
                if (word.equals(tWord)){
                    break;
                }
                tWord = rearrange(tWord, input1);
                count++;
            }
        }
        return count;
    }

  //Args are passed using command line  
  public static void main(String[] args)
    {
        originalString=args[0];
        System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
    }
}

```
