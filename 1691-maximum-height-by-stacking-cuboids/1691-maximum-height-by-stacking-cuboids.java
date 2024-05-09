class Solution {
    public static boolean check(int [] curr,int [] prev){
        if(prev[0]<= curr[0] && prev[1]<=curr[1] && prev[2]<=curr[2]){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int solvetab(int n,int[][] c){
         int[] currRow = new int[n + 1];
        int[] nextRow = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= -1; j--) {
                // include
                int a = 0;
                if (j == -1 || check(c[i], c[j]))
                    a = c[i][2] + nextRow[i + 1];
                // exclude
                int b = 0 + nextRow[j + 1];
                currRow[j + 1] = Math.max(a, b);
            }
            int[] temp = currRow;
            currRow = nextRow;
            nextRow = temp;
        }
        return nextRow[0];
    }
    public int maxHeight(int[][] cuboids) {
             // Sort according to dimensions of all cuboids
        for (int i = 0; i < cuboids.length; i++) {
            Arrays.sort(cuboids[i]);
        }

       Arrays.sort(cuboids, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return a[0] - b[0];
                if (a[1] != b[1])
                    return a[1] - b[1];
                return a[2] - b[2];
            }
        });
      
        int n=cuboids.length;
        //use d

        int ans=solvetab(n,cuboids);
        return ans;
        
    }
}
