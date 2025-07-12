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


class Solution2{
    int missingNum(int arr[]) {
        int n = arr.length;

        int total = (n+1) * (n+2) / 2;
        int sum = 0;

        for(int i:arr){
            sum = i + sum;
        }
        return total - sum;
    }
}