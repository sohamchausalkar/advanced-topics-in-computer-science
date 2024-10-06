// ITERATIVE SOLUTION

public static int fibonacci(int n) {
    if (n <= 1) return n;
    int prev = 0, curr = 1;
    for (int i = 2; i <= n; i++) {
        int temp = curr;
        curr = prev + curr;
        prev = temp;
    }
    return curr;
}


// RECURSIVE SOLUTION 

public static int fibonacci(int n) {
    // Base cases
    if (n == 0) return 0;
    if (n == 1) return 1;
    // Recursive case
    return fibonacci(n - 1) + fibonacci(n - 2);
}
