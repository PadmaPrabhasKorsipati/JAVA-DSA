/* 

import java.util.Scanner;


//swap numbers
public class practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        System.out.println("Before swap:"+" a="+a +" b="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swap:"+" a="+a +" b="+b);
        

    sc.close();

     }

}
    
*/


/* 

// Factorial of Numbers 

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the valuse of N");
        int fact=1;
        int N=sc.nextInt();

        for(int i=1;i<=N;i++){
            fact*=i;

        }

        System.out.println("Factorial of "+N+"="+fact);

        sc.close();



    }
}

*/

/* 
//Sum of first N Natural numbers

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N:");
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            sum+=i;

        }
        System.out.println("The sum of first "+N+" Natural numbers:"+sum);

        sc.close();

    }
}
*/
//Palindrome check 
/* 
import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println(checkpalindrome(str));


    }
    public static boolean checkpalindrome(String str) {
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
           
        }

        return true;
        
    }
    
}
*/

/* 
//even or odd

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("The given number is Even.");
        }

        else{
            System.out.println("The given number is odd.");
        }

        sc.close();


    }
}



*/



//Magic Number 


/* 

import java.util.*;
public class practice {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     
     int original=0;
     int remainder=0;
     
     while(true){

        
         
         if(num==1){
             System.out.println("The given number is a magic number.");
             break;
         }
         else if(num<10){
             System.out.println("The given number is not a magic number.");
             break;
         }
         
         int sum=0;


          while (num>0){
             remainder=num%10;
             sum+=remainder;
             num/=10;
         }
         
         num=sum;
        
         
     }
     
     sc.close();
     
    }
}

 */

/* //armstrong number



import java.util.*;


public class practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        int remainder=0;
        int armstrong=0;
        int count=0;
        int original=num;

        while(num>0){
            count+=1;
            num/=10;
            
        }

        num=original;


        while(num>0){
        
            remainder=num%10;
            armstrong+=Math.pow(remainder,count);
            num/=10;

        }

        if(original==armstrong){
            System.out.println("The given number is a armstrong number.");
        }
        else{
            System.out.println("The given number is not a armstrong number.");

        }

        sc.close();
    }v
}

 */

/* import java.util.*;
public class practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr1=new int[7];

        int[] arr2=new int[3];


        for(int i=0;i<7;i++){
            arr1[i]=sc.nextInt();
            
        }

        for(int i=0;i<3;i++){
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<7;j++){
                if(arr2[i]==arr1[j]){
                    count+=1;
                    
                }
            }
            System.out.println(arr2[i]+"occured "+count+" times");
            
        }
        sc.close();


    }
} */



/**
 * practice
 */
/* public class practice {

    public static void main(String[] args) {
        int n=5;

        int binary=0;

        int place=1;

        while(n>0){

            int remainder=n%2;

            binary=binary+remainder*place;

            place*=10;

            n=n/2;

        }

        System.out.println("the binary:"+binary);
    }
} */

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next().toUpperCase();

        int decimal = 0;
        int power = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {

            char ch = hex.charAt(i);

            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            decimal = decimal + digit * power;

            power = power * 16;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}