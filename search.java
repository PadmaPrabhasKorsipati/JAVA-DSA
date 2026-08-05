 //Linear Search

//import java.util.*;

/**
 * search
 */
/* public class search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int index=-1;

        int target=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;

            }
        }

        if(index!=-1){
            System.out.println("Target is found at the index:"+index);

        }

        else{
            System.out.println("Target is not found in the given array.");
        }

        sc.close();


    }
}
 

 */



//Binary Search


/* 
import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int target=sc.nextInt();

        int index=binarySearch(arr, target);


        if(index!=-1){
            System.out.println("The target is found at the index of:"+index);
        }


        else{
            System.out.println("The target is not found in the given array.");
        }


        sc.close();



    }

        static int binarySearch(int[] arr,int target){

            int start=0;
            int end=arr.length-1;
        

            while(start<=end){
                int mid=start + (end-start)/2;

                if(arr[mid]==target){
                    return mid;

                }

                else if(target>arr[mid]){
                    start=mid+1;
                }

                else{

                    end=mid-1;

                }

            }

            return -1;


        
    }

    
}



*/




// Order Agnostoic Binary  search
/* 

import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={1,2,3,4,5};
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
    */



