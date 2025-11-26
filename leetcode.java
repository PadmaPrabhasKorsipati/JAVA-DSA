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


