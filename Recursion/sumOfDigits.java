// ITERATIVE SOLUTION

public static int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}


// RECURSIVE SOLUTION 
 public static int sumOfDigits(int n) {
    // Base Case
    if(n == 0)
        return 0; 
    // Recursive Case 
    return (n % 10) + sumOfDigits(n / 10); 
}
