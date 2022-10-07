class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0; i< nums.length-1; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]+nums[j]== target){
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}


========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = target - nums[i];
            if(hp.containsKey(a))
                return new int[] {hp.get(a),i};
            
            hp.put(nums[i],i);
        }
        return null;
    }
}

========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j-i] + nums[j] == target){
                    return new int[]{j-i, j};
                }
            }
        }
        return null;
    }
}