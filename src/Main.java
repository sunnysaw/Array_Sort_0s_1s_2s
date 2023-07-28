/*
Question : Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
________________________________________________________________________________________________________________
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
___________________________________________________________________________________________________________________
Explanation:
0s 1s and 2s are segregated
into ascending order.
________________________________________________________________________________________________________________
Example 2:
Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1
______________________________________________________________________________________________________________
Explanation:
0s 1s and 2s are segregated
into ascending order.
______________________________________________________________________________________________________________________
Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array
 arr and N as input parameters and sorts the array in-place.
______________________________________________________________________________________________________________________
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
___________________________________________________________________________________________________________________
Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2
___________________________________________
 */

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while(mid < high){
            if(a[mid] == 0){
                swap(a,mid,low);
                low++;
                mid++;
            }
            else if(a[mid] == 2){
                swap(a,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    public static void swap(int[] a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}