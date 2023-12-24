//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    public static boolean knows(int arr[][],int a,int b,int n){
        if(arr[a][b]==1){
            return true;
        }
        else{
            return false;
        }
    }
    int celebrity(int M[][], int n)
    {
    	// code here
    	int arr[][]=M;
    	Stack<Integer> stk=new Stack<>();
    	for(int i=0;i<n;i++){
    	    stk.push(i);
    	}
    	while(stk.size()>1){
    	    int a=stk.peek();
    	    stk.pop();
    	    int b=stk.peek();
    	    stk.pop();
    	    if(knows(arr,a,b,n)){
    	        stk.push(b);
    	    }
    	    else{
    	        stk.push(a);
    	    }
    	}
    	int celb=stk.peek();
    	int zerocount=0;
    	boolean rowcheck=false;
    	for(int i=0;i<n;i++){
    	    if(arr[celb][i]==0){
    	        zerocount++;
    	    }
    	}
    	if(zerocount==n){
    	    rowcheck=true;
    	}
    	boolean colcheck=false;
    	int onecount=0;
    	for(int i=0;i<n;i++){
    	    if(arr[i][celb]==1){
    	        onecount++;
    	    }
    	}
    	if(onecount==n-1){
    	    colcheck=true;
    	    
    	}
    	if(rowcheck==true && colcheck==true){
    	    return celb;
    	}
    	else{
    	    return -1;
    	}

}
}