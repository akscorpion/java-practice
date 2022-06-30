```java
    public int nearestValidPoint(int x, int y, int[][] p) {
        /*  [{1,2},i=0
            {2,3},i=1
            {4,5}]i=2
            loop chlega i pe
            column is points[i][0] & points[i][1]
            md = abs func
            index
        */
        int md = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<p.length; i++){
            if(x == p[i][0] || y == p[i][1]){
                int tempMD = Math.abs(x - p[i][0]) + Math.abs(y - p[i][1]);
                if(tempMD < md){
                    md = tempMD;
                    index = i;
                }
            }
        }
        return index;
    }
    ```

    We can optimize the code using the fact that either dx or dy will be zero if it is a valid point

    ```java
        public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1; 
        for (int i = 0, smallest = Integer.MAX_VALUE; i < points.length; ++i) {
            int dx = x - points[i][0], dy = y - points[i][1];
            if (dx * dy == 0 && Math.abs(dy + dx) < smallest) {
                smallest = Math.abs(dx + dy);
                index = i;
            }
        }
        return index;
    }
    ```