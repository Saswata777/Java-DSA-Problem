class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
    
    int firstMin = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < firstMin) {
            secondMin = firstMin;
            firstMin = arr[i];
        } else if (arr[i] > firstMin && arr[i] < secondMin) {
            secondMin = arr[i];
        }
    }
    
    if (secondMin == Integer.MAX_VALUE) {
        result.add(-1);
    } else {
        result.add(firstMin);
        result.add(secondMin);
    }
    
    return result;
    }
}
