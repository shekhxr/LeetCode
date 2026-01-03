class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int curr = 1;

        for(int i=0;i<target.length;i++) {
            while(curr < target[i]){
                result.add("Push");
                result.add("Pop");
                curr++;
            }

            result.add("Push");
            curr++;       
        }

        return result;
    }
}
