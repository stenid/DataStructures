public class HomeworkLesson13 {
    // What is the time complexity of the following program:

    private void fun(int n) {
        int i = 1;
        while(i < n) {              // O(log2(n))
            int j = n;
            while(j > 0)            // O(log2(n))
                j = j / 2;
            i = 2 * i;
        }                           // O((log2(n))^2)
    }
}

// In first case if n <= 1 while loop is never executed. Time complexity is O(1).

// In Second case if n > 1 :

// Let's assume that n = 10
// Time complexity for 8 strings loop:

// first iteration:     j = 5 = n/2 = n/2*1/2^0
// second iteration:    j = 2 = n/4 = n/2*1/2^1
// third iteration:     j = 1 = n/8 = n/2 * 1/2^2
// fourth iteration:    j = 0 = n/16 = n/2 * 1/2^3
// k-th iteration:      j = n/2 * 1/2^(k-1) = 0     Equals zero from loop condition.
//                      n/2^1 + (k-1) = 0
//                      n/2^k = 0
//                      log2(n/2^k) = log2(1)
//                      log2(n)-log2(2^k) = log2(1)
//                      log2(n)-k=log2(1)
//                      k = log2(n) - log2(1)
//                      k = log2(n)             -> O(log2(n))

// Time complexity for 6th string loop:
//          int i=1;
//          while (i<n)
//              i = 2*i;

// first iteration:     i = 1 = 2^0
// second iteration:    i = 2 = 2^1
// third iteration:     i = 4 = 2^2
// forth iteration:     i = 8 = 2^3
// k iteration:         i = 2^(k-1)=n   because of condition of loop
//          2^(k-1) = n
//          k-1 = log2(n)
//          k = log2(n)+1
// -> time complexity is O(log2(n))

// Overall time complexity: O(log2(n)*log2(n))=O((log2(n))^2)
