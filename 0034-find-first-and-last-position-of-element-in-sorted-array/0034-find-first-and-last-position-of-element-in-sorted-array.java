class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
              list.add(num);
        }
        int first=list.indexOf(target);
        int last=list.lastIndexOf(target);
        int[] res={first,last};
        return res;
    }
}