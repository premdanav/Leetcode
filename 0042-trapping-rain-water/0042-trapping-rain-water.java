class Solution {
    public int trap(int[] height) {
        
        Stack<Integer> st=new Stack<>();
        
        int ans=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            while(st.size()>0 && height[st.peek()]<=height[i]){
                int rightMax=i;
                int curr=height[st.pop()];
                if(st.size()==0) break;
                int leftMax=st.peek();
                
                int width=rightMax-leftMax-1;
                ans+=(Math.min(height[rightMax],height[leftMax])-curr)*width;
            }
            st.push(i);
        }
        return ans;
    }
}