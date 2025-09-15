

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
