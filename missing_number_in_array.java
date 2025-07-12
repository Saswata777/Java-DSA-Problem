import java.util.Arrays;

class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = 0; i<n; i++){
            if(arr[i]==i+1){
                continue;
            }
            else{
                return  i+1;
            }
        }
        return n+1;
    }
}