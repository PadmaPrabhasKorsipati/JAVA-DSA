
//Linear Search
// it has the worst time complexity

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,56,45,89,23};
        System.out.print("Enter the Element to Search:");
        int target=sc.nextInt();
        int count=0;
        int search=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count+=1;
                search=i;
                break;
            }
           
        }

        if(count==1){
            System.out.println("Element found at index of:"+search);
        }

         else{
                System.out.println("Element not found in the given array.");
            }

        sc.close();

    

    }
}
