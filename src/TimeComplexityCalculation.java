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
//      Iter 1      i = n/2 + 0
//      Iter 2      i = n/2 + 1
//      Iter 3      i = n/2 + 2
//      Iter 4      i = n/2 + 3
//      Iter p      i = n/2 + p-1 = n // it equals to n because in last iteration
// we got condition i <= n in for loop.
//      n/2 + p - 1 = n
//      p = 1+n-n/2
//      p = 1+ (2n-n)/2 = 1 + n/2
//      loop executes n/2 times. so we can take the least upper bound as 'n'

// For second loop(5th line):
//      iter 1      j = 1 = 2^0
//      iter 2      j = 2 = 2^1
//      iter 3      j = 4 = 2^2
//      iter 4      j = 8 = 2^3
//      iter p      j = 2^(p-1) = n (because of condition of loop)
//      n = 2^(p-1)
//      log2(n) = p-1
//      p = log2(n) + 1
//      Time complexity of this loop is O(log2(n))

// For third loop(6th line)"for(k = 1; k <= n; k++)"
//      iter 1      k = 1
//      iter 2      k = 2
//      iter 3      k = 3
//      iter 4      k = 4
//      iter p      k = p = n (condition of loop)
//      Time complexity of that loop is O(n)

// Overall time complexity equals to multiplication of all previous big O, because
//  we got every loop inside other one: 1 * n * log2(n) * n = O(n^2log2(n))