//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class MaxSum
{
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution ob = new Solution();
			    int ans = ob.getMaxSum(root);
			    System.out.println(ans);
                t--;
	        }
    }
}




// } Driver Code Ends


//User function Template for Java
/*class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/
 class make_pair<F,S> {
        private F first;
        private S second;

        public make_pair(F first,S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public void setFirst(F first) {
            this.first = first;
        }

        public S getSecond() {
            return second;
        }

        public void setSecond(S second) {
            this.second = second;
        }

        // You can also override equals and hashCode if needed.
}
class Solution
{
     public static make_pair<Integer,Integer> maxadjnode(Node root){
        if(root==null) {
            make_pair<Integer, Integer> pair = new make_pair<>(0, 0);
            return pair;
        }
        make_pair<Integer,Integer> leftans=maxadjnode(root.left);
        make_pair<Integer,Integer> rightans=maxadjnode(root.right);
        make_pair<Integer,Integer> ans=new make_pair<>(0,0);
        ans.setFirst(root.data+leftans.getSecond()+ rightans.getSecond());
        ans.setSecond(Math.max(leftans.getFirst(), leftans.getSecond())+Math.max(rightans.getFirst(), rightans.getSecond()));
        return ans;

}
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root)
    {
        // add your code here
        make_pair<Integer,Integer> m=maxadjnode(root);
        return Math.max(m.getFirst(),m.getSecond());
    }
}
