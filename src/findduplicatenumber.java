public class findduplicatenumber {
        public int findDuplicate_TLE(int[] nums){
            int n=nums.length;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]==nums[j])
                        return nums[i];
                }
            }
            return -1;
        }
        public int findDuplicate_Accepted(int[] nums){
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]==nums[i+1])
                    return nums[i];
            }
            return -1;
        }
        public int findDuplicate_Accpeted(int[] nums){
            HashSet<Integer> hash=new HashSet<>();
            for(int num:nums){
                if(hash.contains(num)){
                    return num;
                }
                hash.add(num);
            }
            return -1;
        }
        public int findDuplicate(int[] nums){
            int slow=nums[0];
            int fast=nums[0];
            do{
                slow=nums[slow];
                fast=nums[nums[fast]];
            }while(slow!=fast);
            slow=nums[0];
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            return slow;
        }
        public int FLD(int[] nums) {
            // Phase 1: Detect intersection point
            int slow = nums[0];
            int fast = nums[0];

            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            // Phase 2: Find entrance to cycle (duplicate)
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow;
        }
        public int BF_TLE(int[] nums) {
            int temp=0;
            // for(int i=0;i<n;i++){
            //   for(int j=0;j<n;j++){
            //     if(nums[i]==nums[j]){

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        temp=i;
                        break;
                    }
                }
            }
            return nums[temp];
        }
    }
