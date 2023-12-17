//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        if (n == 0) {
            return 0;
        }
        int incl = arr[0];
        int excl = 0;

        for (int i = 1; i < n; i++) {
            int newExcl = Math.max(incl, excl); // Update excl considering the previous incl and excl
            incl = excl + arr[i]; // Update incl for the current element
            excl = newExcl; // Set excl for the next iteration
        }

        return Math.max(incl, excl); // Return the maximum between incl and excl
    }
}