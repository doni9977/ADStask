Recursive Algorithm Analysis

1. Finding Minimum in Array (Recursive)

This algorithm finds the smallest number in an array by comparing each element with the minimum of the remaining elements. It makes exactly n comparisons where n is the array size.

Time Complexity: O(n)

2. Calculating Average (Iterative)

Computes the average by summing all elements and dividing by the count. Must process every element once.

Time Complexity: O(n)

3. Prime Number Check (Optimized Recursive)

Checks if a number is prime by testing divisors up to the square root of n. The number of checks grows with the square root of the input size.

Time Complexity: O(√n)

4. Factorial Calculation

Calculates factorial by multiplying n by the factorial of n-1. The recursion goes n levels deep.

Time Complexity: O(n)

5. Fibonacci Sequence

The classic recursive implementation recalculates the same values many times, leading to exponential growth in operations.

Time Complexity: O(2ⁿ)

6. Power Calculation

Computes aⁿ by multiplying a by itself n times through recursive calls.

Time Complexity: O(n)

7. Array Reversal (Recursive)

Reverses an array by swapping the first and last elements and recursively processing the remaining subarray. Performs n/2 swaps.

Time Complexity: O(n)

8. Digit-Only String Check

Verifies if all characters in a string are digits by checking each character once from start to end.

Time Complexity: O(n)

9. Binomial Coefficient

Calculates combinations using Pascal's identity. Without optimization, it recalculates the same values repeatedly.

Time Complexity: O(2ⁿ)

10. GCD (Euclidean Algorithm)

Finds greatest common divisor by repeatedly taking remainders. The number of operations grows logarithmically with input size.

Time Complexity: O(log n)

Comparative Analysis

Array Minimum: O(n) - Linear time


Average Calculation: O(n) - Must see all elements

Prime Check: O(√n) - Only checks up to root

Factorial: O(n) - Straightforward recursion

Fibonacci: O(2ⁿ) - Exponential due to recalculations

Power: O(n) - Linear multiplications

Array Reversal: O(n) - Half-length swaps

Digit Check: O(n) - Character-by-character

Binomial: O(2ⁿ) - Worst-case exponential

GCD: O(log n) - Very efficient
