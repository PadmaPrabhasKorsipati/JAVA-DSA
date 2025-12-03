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
/* 
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

*/


//Find the smallest letter greater than the target 
/* 
import java.util.Scanner;

public class interview {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char[] letter={'c','f','j'};
        System.out.print("Enter the target character:");
        char target=sc.next().charAt(0);

        System.out.println("The Smallest Element greater than target is:"+Smallestelementgreattarget(letter, target));
      sc.close();

    }

    static char Smallestelementgreattarget(char[] letter,char target){
        int s=0;
        int e=letter.length-1;
        
      

        while (s<=e) {
              int mid=s+((e-s)/2);
            if(letter[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return letter[(s%(letter.length))];
    }
}
    */


//Find First and Last Position of Element in Sorted Array
import java.util.Scanner;
public class interview {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]={5,7,7,8,8,10};
        System.out.print("Enter the Element:");
        int target=sc.nextInt();

        int first=firstpos(arr, target);
        int last=Lastpos(arr, target);
        
        System.out.println(first+","+last);



        sc.close();
        
        
    }

    static int firstpos(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int index=-1;
        while(s<=e){
            
        int mid=s+((e-s)/2);
        
            if(arr[mid]==target){
                index=mid;
                e=mid-1;

            }
            else if(arr[mid]>target){
                e=mid-1;

            }
            else{
                s=mid+1;
            }

        }

        return index;
    }

static int Lastpos(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int index=-1;
        while(s<=e){
            
        int mid=s+((e-s)/2);
        
            if(arr[mid]==target){
                index=mid;
                s=mid+1;

            }
            else if(arr[mid]>target){
                e=mid-1;

            }
            else{
                s=mid+1;
            }

        }

        return index;
    }

}