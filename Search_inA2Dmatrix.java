class Search_inA2Dmatrix
{
    boolean check(int[][] mat,int target)
    {
        int l=mat.length;
        int c=mat[0].length;
        int left=0,right=l-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mat[mid][0]<=target && mat[mid][c-1]>=target)
            {
                for(int i=0;i<c;i++)
                if(mat[mid][i]==target)
                return true;
                return false;
                
            }
            else if(mat[mid][0]>target)
            right=mid-1;
            else
            left =mid+1;
        }
        return false;
    }
}