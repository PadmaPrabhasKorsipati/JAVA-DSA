import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        while(true){
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the type of Operator:");


            char op=sc.next().trim().charAt(0);

            int ans=0;

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter two Numbers:");

                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if(op=='+'){
                    ans=num1+num2;

                }

                else if (op=='-') {
                    ans=num1-num2;
                    
                }

                 else if (op=='*') {
                    ans=num1*num2;
                    
                }

                 else if (op=='/'&& num2!=0) {
                    ans=num1/num2;
                  
                    
                }
                 else if (op=='%') {
                    ans=num1%num2;
                    
                }

                System.out.println(ans);

            }
            else if(op=='x' || op=='X'){
                break;

            }

            else{
                System.out.println("Enter valid operator.");
            }


        }
        
    }
}
