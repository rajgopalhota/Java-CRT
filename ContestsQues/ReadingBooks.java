/*
Reading Books (Difficulty - easy)
Description
There are n books, and Kotivalo and Justina are going to read them all. For each book, you know the time it takes to read it.

They both read each book from beginning to end, and they cannot read a book at the same time. What is the minimum total time required for both to complete all books?

Prohibited Keywords
No prohibited keywords for this problem.
Input Format
The first line of input contains t denoting the number of testcases

The second input line has an integer n the number of books.

The Third line has n integers a1,a2,a3,a4....an . the time required to read each book.

Output Format
print one integer the minimum total time for each testcase in a separate line

Constraints
1<=T<=100

1<=n<=2.105

1<=ai<=109

Example
Input 1
1
3
2 8 3
 
Output 1
16
*/
import java.util.*;

public class ReadingBooks {
    public static void main(String[] args) {
        Scanner rj = new Scanner(System.in);
        int t = rj.nextInt();

        while (t-- > 0) {
            int kln = rj.nextInt();
            int[] klTims = new int[kln];

            for (int i = 0; i < kln; i++)
                klTims[i] = rj.nextInt();

            Arrays.sort(klTims);

            long klS = 0;

            for (int x : klTims)
                klS += x;

            long totalTime = Math.max(klS, 2 * klTims[kln - 1]);

            System.out.println(totalTime);
        }
    }
}
