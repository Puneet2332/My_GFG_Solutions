//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here   
        // If both numbers are the same, return -1.
        if (m == n) {
            return -1;
        }
        
        // Find the position of the rightmost different bit.
        int position = 1;
        
        // Use XOR operation to find the differing bit.
        // Right-shift until the differing bit is found.
        while (((m & 1) == (n & 1)) && (m > 0 || n > 0)) {
            m >>= 1;
            n >>= 1;
            position++;
        }
        
        return position;
            
    }
}


