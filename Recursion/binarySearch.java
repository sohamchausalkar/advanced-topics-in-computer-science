// ITERATIVE SOLUTION

public static boolean binarySearch(int[] array, int target) {
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (array[mid] == target) {
            return true;
        } else if (array[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return false;
}


// RECURSIVE SOLUTION 

    public static boolean binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length - 1); 
    }
    
    private static boolean binarySearchHelper(int[] array, int target, int low, int high)
    {
        // base cases
        if(low > high)
            return false; 
        else if(array[(high + low)/2] == target)
            return true; 
        // recursive cases
        if (array[(high + low)/2] < target)
            return binarySearchHelper(array, target, ((high + low)/2) + 1, high);
        else
            return binarySearchHelper(array, target, low , ((high + low)/2) - 1);
    }
