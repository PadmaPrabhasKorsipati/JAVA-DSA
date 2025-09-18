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



    
    






