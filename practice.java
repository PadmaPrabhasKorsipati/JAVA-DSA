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

    
    






