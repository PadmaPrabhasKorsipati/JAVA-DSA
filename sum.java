import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        a=sc.nextInt();
        System.out.print("Enter value of b:");
        b=sc.nextInt();
        System.out.print("Enter value of c:");
        c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("The largest number is: "+a );

        }
        else if(b>a && b>c){

            System.out.println("The Largest number is: "+b);

        }

        else{
            System.out.println("The largest number is: "+c);
        }

        sc.close();

    }
    
}
