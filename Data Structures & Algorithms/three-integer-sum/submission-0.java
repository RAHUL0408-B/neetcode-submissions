

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        if (!ans.contains(triplet)) {
                            ans.add(triplet);
                        }

                    }

                }

            }

        }

        return ans;
    }
}