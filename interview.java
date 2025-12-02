//Interview Questions by Kunal Kushwaha

/* 
//1.Ceiling of a Number
//Ceiling= smallest element in array greater or equal to target 
// to find a ceiling number first an array need to be sorted  in ASC

import java.util.Scanner;

public class interview {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,6,9,10,14,17};
        System.out.print("Enter the Element:");
        int target=sc.nextInt();

        int s=0;
        int e=arr.length-1;
        int index=-1;
        while(s<=e){
            int mid=s+((e-s))/2;
            if(arr[mid]>=target){
               index=mid;
               e=mid-1;

            }
            else{
                s=mid+1;
            }

          

        }

        if(index!=-1){
            System.out.println("The Ceiling of a Number is:"+arr[index]);
        }
        else{
            System.out.println("There is no Ceiling Element found.");
        }

        sc.close();


    }
    
}
*/

//Floor of a Number
//Floor is a number that is greatest smaller or eaual to target 
//to find a Floor number first an array need to be sorted  in ASC

import java.util.Scanner;
public class interview {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,6,9,10,14,17};
        System.out.print("Enter the Element:");
        int target=sc.nextInt();

        int s=0;
        int e=arr.length-1;
        int index=-1;

        while(s<=e){
            int mid=s+((e-s)/2);
            if(arr[mid]<=target){
                index=mid;
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }

        
        if(index!=-1){
            System.out.println("The Floor  of a Number is:"+arr[index]);
        }
        else{
            System.out.println("There is no Floor Element found.");
        }

        sc.close();

        
    }
}