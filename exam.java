//fibonacci

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int f=0;
        int s=1;
        int p=0;

        for(int i=0;i<n;i++ ){

            System.out.print(p+"");


            p=f+s;

            f=s;
            s=p;

        }

        sc.close();
    }
    
}
