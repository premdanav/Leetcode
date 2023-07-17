class Solution {
    public int maxArea(int[] height) {
        int max=0;
         int area=0;
        // for(int i=0;i<height.length;i++)
        // {
        //     for(int j=i+1;j<height.length;j++)
        //     {
        //         // area = Math.min(height[i], height[j]) * (j - i);
        //         if(height[i]<height[j])
        //         {
        //             area=height[i]*(j-i);
        //         }
        //         else if(height[i]>height[j])
        //         {
        //             area=height[j]*(j-i);
        //         }
        //         else if(height[i]==height[j])
        //         {
        //             area=height[i]*(j-i);
        //         }
        //         if(area>max)
        //         {
        //             max=area;
        //         }
        //     }
        // }
        int min=0;
        int i=0,j=height.length-1;
        while(i<=j){
            min=Math.min(height[i],height[j]);
            area=min*(j-i);
            if(max<area)
            max=area;
            if(min==height[i])
            i++;
            else
            j--;
        }
        return max;
    }
}