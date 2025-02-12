class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif=arr[0]-arr[1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]!=dif){
                return false;
            }
        }
        return true;
    }
}