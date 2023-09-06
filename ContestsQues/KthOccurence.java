/*

Kth occurance of a value V in the list. (Difficulty - easymedium)
Description
Given an array, your task is to find the k-th occurrence (from left to right) of an integer v. To make the problem more difficult (and interesting!), you’ll have to answer m such queries.

Prohibited Keywords
No prohibited keywords for this problem.
Input Format
There are several test cases.
First line is the number of test cases.
Second line of each test case contains two integers n, m those are : the number of elements in the array arr[], and the number of queries.
The next line contains n positive integers.
Each of the following m lines contains two integer k and v.
Output Format
For each query, print the 1-based location seperated by space of the occurrence. If there is no such element, output ‘-1’ instead.

print a new Line after every test case.

Constraints
1≤T≤10

1 ≤ n, m ≤ 1000, 000

0≤arr[i]≤1000,000

1 ≤ k ≤ n, 1 ≤ v ≤ 1, 000, 000

Example
Input 1
1
8 4
1 3 2 2 4 3 2 1
1 3
2 4
3 2
4 2
 
Output 1
2 -1 7 -1

*/

import java.util.*;

public class KthOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of elements in the array
            int m = sc.nextInt(); // number of queries
            int[] arr = new int[n]; // array of elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // use a map to store the occurrences of each element
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int val = arr[i];
                // if the map does not contain the element, create a new list
                if (!map.containsKey(val)) {
                    map.put(val, new ArrayList<>());
                }
                // add the index of the element to the list
                map.get(val).add(i + 1);
            }
            // answer each query
            for (int i = 0; i < m; i++) {
                int k = sc.nextInt(); // the k-th occurrence
                int v = sc.nextInt(); // the element value
                // if the map contains the element and the list size is at least k
                if (map.containsKey(v) && map.get(v).size() >= k) {
                    // print the k-th element of the list
                    System.out.print(map.get(v).get(k - 1) + " ");
                } else {
                    // otherwise, print -1
                    System.out.print(-1 + " ");
                }
            }
            System.out.println(); // print a new line after each test case
        }
        sc.close();
    }
}