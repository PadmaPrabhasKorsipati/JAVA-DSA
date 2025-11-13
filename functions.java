/*
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        
        swap(a,b);
        System.out.println("a:" + a +" , b:"+ b);
    }


    static void swap(int a,int b){
        int temp=b;
        b=a;
        a=temp;

        System.out.println("a:" + a +" , b:"+ b);
    }
    
}
 */
/* 
public class functions {

    public static void main(String[] args) {
        String name="Prabhas";
        greet(name);
    }

    public static void greet(String naam) {
        naam="gameover";
        System.out.println(naam);

        
    }
}

*/



//Questions

//Prime Numbers

import java.util.Scanner;

public class functions {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:");
      
        int num=sc.nextInt();

        isarmstrong(num);


        
    }


    static void isprime(int num){
       int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=1;

            }

        }

        if(sum<3){
            System.out.println("The given Number is a Prime Number.");
        }

        else{
            System.out.println("The given Number is not a Prime Number.");
        }
    }



    static void isarmstrong(int num){
        int a=num;
        int sum=0;
        int cube=0;

        while(a>0){
            int rem=a%10;
            cube=Math.pow(rem,3);
            sum+=cube;
            a=a/10;

        }

        if(num==sum){
            System.out.println("The given Number is a Armstrong Number");
        }

        else{
            System.out.println("The given Number is not a Armstrong Number");
        }
    }


}