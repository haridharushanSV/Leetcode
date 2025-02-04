class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i=0;i<4;i++)
        {
            if(check(mat,target))
            {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    public boolean check(int[][] mat,int[][] target)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] rotate90(int[][] mat)
    {
        int n = mat.length;
        int[][] rotate = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotate[j][n-1-i] = mat[i][j];   
            }
        }
        return rotate;
    }
}