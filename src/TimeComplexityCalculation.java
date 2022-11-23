public class TimeComplexityCalculation {
    private void fun(int n) {
        int i, j, k, count = 0;                 // O(1)
        for (i = n / 2; i <= n; i++)            // O(n)
            for (j = 1; j <= n; j = j * 2)      // O(log2(n))
                for(k = 1; k <= n; k++)         // O(n)
                    count++;                    // O(n^2log2(n))
    }
}
// Homework is to calculate the time complexity of this program.

// In third line time complexity equals to 1. It takes constant amount of time.

// For first for loop(4th line):
//      Iteration 1      i = n/2 + 0
//      Iteration 2      i = n/2 + 1
//      Iteration 3      i = n/2 + 2
//      Iteration 4      i = n/2 + 3
//      Iteration p      i = n/2 + p-1 = n // it equals to n because in last iteration
// we got condition i <= n in for loop.
//      n/2 + p - 1 = n
//      p = 1+n-n/2
//      p = 1+ (2n-n)/2 = 1 + n/2
//      loop executes n/2 times. so we can take the least upper bound as 'n'

// For second loop(5th line):
//      iteration 1      j = 1 = 2^0
//      iteration 2      j = 2 = 2^1
//      iteration 3      j = 4 = 2^2
//      iteration 4      j = 8 = 2^3
//      iteration p      j = 2^(p-1) = n (because of condition of loop)
//      n = 2^(p-1)
//      log2(n) = p-1
//      p = log2(n) + 1
//      Time complexity of this loop is O(log2(n))

// For third loop(6th line)"for(k = 1; k <= n; k++)"
//      iteration 1      k = 1
//      iteration 2      k = 2
//      iteration 3      k = 3
//      iteration 4      k = 4
//      iteration p      k = p = n (condition of loop)
//      Time complexity of that loop is O(n)

// Overall time complexity equals to multiplication of all previous big O, because
//  we got every loop inside other one: 1 * n * log2(n) * n = O(n^2log2(n))