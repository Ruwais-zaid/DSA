class Solution {
    public int maxProfit(int[] prices) {
        int arr[]=prices;
        Stack<Integer> stk=new Stack<>();
        ArrayList<Integer> mn=new ArrayList<>();
        stk.add(arr[0]);
        int sum=0;
        for(int i=1;i<arr.length;i++) {
            int val = arr[i];
            if (val > stk.peek()) {
                mn.add(Math.abs(val-stk.peek()));
                stk.pop();
                stk.add(val);


            } else {
                stk.pop();
                stk.add(val);
                mn.add(0);
            }
        }
        for(int i=0;i<mn.size();i++){
            sum+=mn.get(i);
        }
        return sum;
        
    }
}