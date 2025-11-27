//Arrays
//Zero permutation 
/* 
import java.util.Scanner;

public class leetcode {

   
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int [] nums=new int[6];

    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();

    }
    int[] result = buildArray(nums);
for (int x : result) {
    System.out.print(x + " ");
}


sc.close();

   }

    public static int[] buildArray(int[] nums) {
    int[] ans=new int[nums.length];
       for(int i=0;i<nums.length;i++) {
        ans[i]=nums[nums[i]];

       }

       return ans;
    }


}
*/


//concatenation of array
/* 
import java.util.Scanner;
public class leetcode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    int [] nums=new int[6];

    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();

    }

    int[] result=getConcatenation(nums);

    for(int x: result){
        System.out.print(x+" ");
    }
sc.close();  
    }
     public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];

        

        }

        return ans;
        
    }
}


*/


// sum of 1d array
/* 
import java.util.Scanner;
public class leetcode {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

    int [] nums=new int[4];

    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();

    }

    int[] result=runningSum(nums);

    for(int x: result){
        System.out.print(x+" ");
    }
sc.close();  
        
    }


public static int[] runningSum(int[] nums){
    int[] ans=new int[nums.length];
    int sum=0;
    for(int i=0;i<ans.length;i++){
        sum+=nums[i];
        ans[i]=sum;
        

    }

    return ans;
}
}

*/

//maxximum wealth 
/*
import java.util.Scanner;

public class leetcode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask how many rows (customers)
        System.out.print("Enter number of customers (rows): ");
        int rows = sc.nextInt();

        int[][] accounts = new int[rows][];

        // Input different column sizes for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of banks for customer " + (i + 1) + ": ");
            int cols = sc.nextInt();

             accounts[i] = new int[cols];

            System.out.println("Enter money for customer " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        // Call function
        System.out.println("Maximum Wealth = " + maximumWealth(accounts));

        sc.close();
    }

    public static int maximumWealth(int[][] accounts) {

        int rich = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            // IMPORTANT: this handles uneven column sizes
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            rich = Math.max(rich, sum);
        }

        return rich;
    }
}
 */



//Shuffle the array
import java.util.Scanner;
public class leetcode {

public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

    int [] nums=new int[4];
    System.out.println("Enter the number");
     int n=sc.nextInt();
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();

    }

    int[] result=shuffle(nums,n);

    for(int x: result){
        System.out.print(x+" ");
    }
sc.close(); 
    
    }
public static int[] shuffle(int[] nums, int n) {

    for(int i=0;i<n;i++){
        nums[2*n]=nums[i];
        nums[i+1]=nums[n+1];
        
    }

    return nums;
        
    }


}

