//Arrays
//Zer permutation 
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
