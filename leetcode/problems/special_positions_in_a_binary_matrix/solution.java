class Solution {
    public int numSpecial(int[][] mat) {
         int count=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    boolean special=true;
                    for(int l=i+1;l<m;l++){
                       if(mat[l][j]==1){
                           special=false;
                           break;
                       }
                    }
                    for(int l=i-1;l>=0;l--){
                        if(special==false)
                        break;
                       if(mat[l][j]==1){
                           special=false;
                           break;
                       }
                    }
                    for(int k=j-1;k>=0;k--){
                        if(special==false)
                        break;
                       if(mat[i][k]==1){
                           special=false;
                           break;
                       }
                    }
                    for(int k=j+1;k<n;k++){
                        if(special==false)
                        break;
                        if(mat[i][k]==1){
                           special=false;
                           break;
                       }
                    }
                    if(special)
                    count++;
                }
            }
        }
        return count;
    }
}