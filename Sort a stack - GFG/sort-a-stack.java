//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public static void sort(Stack<Integer> stk,int top){
        if(stk.isEmpty() || stk.peek()<top){
            stk.push(top);
            return;
        }
        int ans=stk.peek();
        stk.pop();
        sort(stk,top);
        stk.push(ans);
    }
    public static void reverse(Stack<Integer> stk){
        //base case
        if(stk.isEmpty()){
            return;
        }
        int top=stk.peek();
        stk.pop();
        reverse(stk);
        sort(stk,top);
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    reverse(s);
	    return s;
		//add code here.
	}
}