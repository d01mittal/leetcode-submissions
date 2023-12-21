import java.util.*;
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=0;
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=1;i<points.length-1;i++){
            int diff=points[i][0]-points[i-1][0];
            max=Math.max(max,diff);
        }
        return max;
    }
}