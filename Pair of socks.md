```java
class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        ArrayList<Integer> list = new ArrayList<>();
        int pairCount=0;
        for (Integer integer : ar) {
            if(list.contains(integer)){
                pairCount++;
                list.remove(integer);
            } else{
                list.add(integer);
            }
        }
        return pairCount;

    }

}
```