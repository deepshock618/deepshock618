package com.project;

import java.util.Scanner;

    public class Calculator
    {
        int a,b;
        char c;
        public Calculator()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number.");
            a=sc.nextInt();
            System.out.println("Enter the second number.");
            b=sc.nextInt();
            System.out.println("Enter symbol accordingly: " +
                    "/n 1. + for addition 2. - for subtraction 3. * for multiplication 4. / for division");
            c=sc.next().charAt(0);
        }

        public void calculate()
        {
            int x=a,y=b;
            float ans;
            char c2=c;
            if(c2=='+')
            {   ans=x+y;
                System.out.println("The result of the addition is "+ans);
            }
            else if(c2=='-')
            {   ans=x-y;
                System.out.println("The result of the subtraction is "+ans);
            }
            else if(c2=='*')
            {   ans=x*y;
                System.out.println("The result of the multiplication is "+ans);
            }
            else if(c2=='/')
            {
                if (y == 0)
                    System.out.println("You can't divide with a zero as denominator. Try again with a different number.");
                else
                    {
                    ans = (float) x / y;
                    System.out.println("The result of the division is " + ans);
                }
            }
            else
                System.out.println("Invalid input.");


        }


}
