class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int var = 1;

        while(set.contains(var)){
            var++;
        }
        return var;
    }
}
