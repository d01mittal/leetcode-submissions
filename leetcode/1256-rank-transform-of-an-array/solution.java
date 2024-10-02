import java.util.Hashtable;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a);
        Hashtable<Integer, Integer> store=new Hashtable<>();
        int k=1;
        for(int i=0;i<n;i++){
            if(!store.containsKey(a[i])){
                store.put(a[i], k);
                k++;
            }
        }
        for(int i=0;i<n;i++){
            ans[i]=store.get(arr[i]);
        }
        return ans;
    }
}
