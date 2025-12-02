
//Linear Search
// it has the worst time complexity
/* 
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
*/

//Binary Search
/* 
import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        System.out.print("Enter the Element to search:");
        int target=sc.nextInt();
        int s=0;
        int e=arr.length-1;
        int index=-1;
        while(s<=e){
            int mid=s+((e-s)/2);

            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }

        if(index!=-1){
            System.out.println("The Element found at index:"+index);
        }
        else{
            System.out.println("The Element not found int  the given array");
        }

        sc.close();


    }


}

*/




// Order Agnostoic Binary  search

import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={5,4,3,2,1};
       System.out.print("Enter the Element to find:");
        int target=sc.nextInt();
        int result=OrderAgnosticBS(arr, target);

        if(result!=-1){
            System.out.println("The Element found at index :"+result);

        }
        else{
            System.out.println("The Element not found in the given array. ");
        }

        sc.close();
        
    }
   
    static int OrderAgnosticBS(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        boolean ASC=arr[s]<arr[e];
        
        while(s<=e){
            
        int mid=s+((e-s)/2);

            if(arr[mid]==target){
                return mid;
            }

            if(ASC){
                if (arr[mid]<target) {
                    s=mid+1;
                    
                }
                else{
                    e=mid-1;
                }
            }

            else{
                if(arr[mid]<target){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }


}